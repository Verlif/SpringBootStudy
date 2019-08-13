package com.study.entity.ext;

import com.study.entity.Results;

public class FailResults extends Results {

    //未查找到数据时
    public static final String NO_DATA = "201";
    //token中的用户Id于请求的用户id不匹配时
    public static final String MISMATCH = "202";
    //未知错误
    public static final String UNKNOWN_ERROR = "204";

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
