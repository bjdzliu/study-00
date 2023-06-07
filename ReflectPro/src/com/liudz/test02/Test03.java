package com.liudz.test02;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test03 {


    public static void main(String[] args) throws NoSuchMethodException {
        Class cls = Student.class;
        Method[] methods = cls.getMethods();
        Method work = cls.getDeclaredMethod("work");

        System.out.println(work.getName());

        int modifiers = work.getModifiers();
        System.out.println(modifiers);


    }


}
