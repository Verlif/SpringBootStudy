package com.study.proxy;

import java.lang.reflect.Method;

public class Introduction extends BaseProxy {

    public Introduction(Object object) {
        super(object);
    }

    @Override
    boolean before(Object proxy, Method method, Object[] args) {
        System.out.println("现在调用的类是" + target.getClass().getName());
        System.out.println("现在调用的方法是" + method.getName());
        return true;
    }

}
