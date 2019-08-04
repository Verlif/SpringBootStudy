package com.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public abstract class BaseProxy implements InvocationHandler {
    Object target;

    BaseProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (before(proxy, method, args)) {
            return after(proxy, method, args, method.invoke(target, args));
        } else
            return null;
    }

    /**
     * 方法使用前的调用
     * @param proxy     调用的代理
     * @param method    被调用的方法
     * @param args      被调用方法的参数
     * @return          代理是否能执行被调用方法
     */
    abstract boolean before(Object proxy, Method method, Object[] args);

    /**
     * 方法使用前的调用
     * @param proxy     调用的代理
     * @param method    被调用的方法
     * @param args      被调用方法的参数
     * @param result    方法返回值
     * @return          invoke返回值
     */
    Object after(Object proxy, Method method, Object[] args, Object result) {
        return result;
    }
}
