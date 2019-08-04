package com.study.utils;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import org.json.JSONException;

import java.io.*;
import java.util.Properties;

//借助腾讯云短信平台
public class QMegCodeUtil {

    //存放短信接口参数文件
    private static final String FILE_PROP = "message.properties";
    //存放短信模板内容文件，UTF-8编码格式
    private static final String FILE_TEMPLATE = "messageTemplate.txt";

    public static final String APP_ID = "APP_ID";
    public static final String APP_KEY = "APP_KEY";
    public static final String TEMPLATE = "TEMPLATE";

    private int appId;          //短信应用SDK AppID
    private String appKey;      //短信应用SDK AppKey
    private String template;    //模板样式内容，与短信平台中的模板一致

    public QMegCodeUtil() {}

    /**
     * 初始化短信基本数据
     * @param properties    参数中需要有以下参数
     *                      APP_ID: 短信应用 SDK AppID
     *                      APP_KEY:    短信应用 SDK AppKey
     *                      TEMPLATE:   模板样式
     */
    public QMegCodeUtil(Properties properties) {
        appId = Integer.parseInt(properties.getProperty(APP_ID));
        appKey = properties.getProperty(APP_KEY);
        template = properties.getProperty(TEMPLATE);
    }

    public void replaceMessage(String oldChar, String newChar) {
        template = template.replace(oldChar, newChar);
    }

    /**
     * 向目标手机号发送验证码，需要在短信内容模板中添加"{code}"，该位置会被替换成相应的验证码
     * @param phoneNumbers  目标手机号集
     * @param code  对应手机号的验证码
     * @return 返回运行状态，与验证码发送成功与否无关
     */
    public boolean sendCode(String[] phoneNumbers, String[] code) {
        //参数未初始化时，从配置文本中调取参数
        if (appId == 0) {
            PropFileUtil propFileUtil = new PropFileUtil(FILE_PROP);
            appId = Integer.parseInt(propFileUtil.getProperty(APP_ID));
            appKey = propFileUtil.getProperty(APP_KEY);
            try {
                BufferedReader br = new BufferedReader(new FileReader(FILE_TEMPLATE));
                template = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        SmsSingleSender ssender = new SmsSingleSender(appId, appKey);

        for (int i = 0; i < phoneNumbers.length; i++) {
            String message = template.replace("{code}", code[i]);
            new Thread(new SendMessage(
                    ssender,
                    phoneNumbers[i],
                    message)).start();
        }
        return true;
    }

    //用于向一个手机号发送验证码信息
    class SendMessage implements Runnable {

        private String phoneNumber;
        private String message;
        private SmsSingleSender sss;

        SendMessage(SmsSingleSender sss, String phoneNumber, String message) {
            this.sss = sss;
            this.phoneNumber = phoneNumber;
            this.message = message;
        }

        @Override
        public void run() {
            try {
                SmsSingleSenderResult sssr = sss.send(0, "86", phoneNumber,
                        message, "", "");
                if (sssr.result == 0)
                System.out.println(sssr);
            } catch (HTTPException | JSONException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
