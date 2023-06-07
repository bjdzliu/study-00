package com.liudz;

import java.util.Arrays;

public class testString {

    public static void main(String[] args) {


        //通过构造器来创建对象：
        String s1 = new String();
        String s2= new String("this is s2");
        String s3= new String(new char[]{'a','v','f'});




        String s = "abcdefg";
        System.out.println(s);

        //定义一个整型数组
        int[] testint= new int[10];
        int[] testint2={1,2,2,2,2,2,2,2,2,2,2,2,2,};

        /*
        int[] myint =
        int[] ggint = {1,2,3}
        int[] hh=new int[5];
         */


        for(int i = 0;i<10;i++){
            testint[i]=i;
            testint2[i]=i;
        }
        System.out.println(Arrays.toString(testint));
        System.out.println(Arrays.toString(testint2));

        int[] cht;
        cht = new int[5];
        cht[0] = 1;

        char[] arr = new char[5];
        arr[0] = 0;
        arr[0] = 1;


        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));
//字符串某个索引的值
        System.out.println(s.charAt(1));

//字符串的长度
        System.out.println(s.length());
//字符串是否为空
        String s5 = new String("isss empty?");
        System.out.println("字符串是否为空: "+s5.isEmpty());
        System.out.println("获取字符串的下标对应的字符为: "+s5.charAt(2));

        String s6 = new String("abcd");
        String s7= "afcde";
        String s8="afcde";

        System.out.println("------ \"afcde\" == ----- ");
        System.out.println(s8==s7);
        System.out.println("----System.out.println(s6.equals(s7));-----");
        System.out.println(s6.equals(s7));

        System.out.println("f的ascii： "+(int)'f');
        System.out.println("f的ascii： "+(int)'b');
        //f 的ascii码
        System.out.println(s6.compareTo(s7));

        Boolean s10 = false;
        System.out.println(s10 ? 'b':'c');

        String s11="this ";

        String s12="is an apple";
        String s13="abcdefghikjklmnopq ggg aggg ";
        System.out.println(s11.concat(s12));

        System.out.println(s13.substring(1));

        System.out.println(s13.substring(1,5));

        System.out.println(s13.replace("ggg","newstr"));

        String s14 = "aa-1b-c-d-e-f";
        String[] newchar=s14.split("-");
        System.out.println(Arrays.toString(newchar));

        char a = 'a';
        System.out.println((int)a);

        char num=12;
        String num2="12";
        int sum = Integer.parseInt(num2)+10;

        System.out.println(sum);

        String s15 = "abcDefg";
        System.out.println(s15.toUpperCase());
        System.out.println(s15.toLowerCase());


        String s16 ="   sss s ";
        System.out.println(s16.trim());
    //转换为字符类型
        Integer s17=100;
        System.out.println(String.valueOf(s17));









    }


}
