package com.liudz.test02;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //四种反射的方式

        Person p = new Person();
        Class c1 = p.getClass();
        System.out.println(c1);

        Class c2 = Person.class;
        System.out.println(c2);

        System.out.println(c1==c2);

        Class c3= Class.forName("com.liudz.test02.Person");


        ClassLoader loader = Test.class.getClassLoader();
        Class c4 = loader.loadClass("com.liudz.test02.Person");



    }
}
