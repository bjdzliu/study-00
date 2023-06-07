package com.liudz.test02;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test02 {

        public static void main(String[] args) throws NoSuchFieldException, InstantiationException, IllegalAccessException {

            Class cls = Student.class;


            System.out.println("----getFields---------");
            Field[] fields = cls.getFields();
            for (Field f : fields) {
                System.out.println(f);
            }

            System.out.println("----getDeclaredFields---------");
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field f : declaredFields) {
                System.out.println(f);
            }

            //获取指定的属性
            System.out.println("------获取指定的属性-------");
            Field f2 = cls.getField("name");
            System.out.println(f2);

            Field sno = cls.getDeclaredField("sno");
            System.out.println("sno is "+sno);


            System.out.println("------获取属性的具体结构-------");
            //获取指定的属性的类型
            Class f2type = f2.getType();
            System.out.println(f2type.getName()); //name的类型是String，输出String


            System.out.println("-------------");
            //获取指定的属性修饰符号

            int modifiers = f2.getModifiers();
            System.out.println(modifiers);
            System.out.println(Modifier.toString(modifiers));
            //public class Modifier 这里定义了每个数值的含义

            System.out.println("------获取属性的名字-------");
            String name = f2.getName();
            System.out.println(name);
            System.out.println("-------------");

            Field sco = cls.getField("score");
            Object obj = cls.newInstance();
            sco.set(obj,100);
            System.out.println(obj);



        }
}
