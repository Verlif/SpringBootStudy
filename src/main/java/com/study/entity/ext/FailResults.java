package com.study.entity.ext;

import com.study.entity.Results;

import java.util.ArrayList;

public class FailResults extends Results {

    //未查找到数据时
    public static final String NO_DATA = "501";
    //token中的用户Id于请求的用户id不匹配时
    public static final String MISMATCH = "502";
    //一般问题提示
    public static final String DEFAULT = "503";
    //未知错误
    public static final String UNKNOWN_ERROR = "504";

    /**
     * 错误结果，默认返回
     * @param msg
     */
    public FailResults(String msg) {
        setCode(UNKNOWN_ERROR);
        setMsg(msg);
    }
    public FailResults(String msg, String errorCode) {
        setCode(errorCode);
        setMsg(msg);
    }
}
