package com.liudz.test01;

import java.lang.reflect.Method;

public class Demo {

    public static void main(String[] args) {

        String str = "com.liudz.test01.AliPay";
        Class cls = null;
        try {
            cls = Class.forName(str);
            Object o = cls.newInstance();
            Method method = cls.getMethod("payOnline");
            method.invoke(o);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
