package com.liudz;


public class testInteger01 extends test00 {

    public static void main(String[] args) {
        Integer i = 12;
        System.out.println(" Integer i = 12 result is "+i);
        Integer ii = new Integer(14);
        int m = ii;
        System.out.println("Integer ii = new Integer(14); result is "+m);

        //父类中的a
        System.out.println(a);

        testInteger01 test = new testInteger01();
        System.out.println(test.a);

        Integer i1 = new Integer(12);
        Integer i2 = new Integer(12);
        System.out.println(i1.compareTo(i2));
        System.out.println(i1==i2);
        String b="b's string";
        String c=b;
        System.out.print("b==c 's result  ");
        System.out.println(b==c);


        b="ssss";
        System.out.println("c is :  "+c);
        System.out.println(b == c);
        change(b);
        System.out.println(b);


    }

    public static void change(String a){
        a="aaa";
    }

}

