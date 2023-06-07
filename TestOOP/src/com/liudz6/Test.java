package com.liudz6;
import com.liudz.Demo;

import java.util.ArrayList;

public class Test {
    int a;
    static int sa;

    public void a(){

        System.out.println("----a");
        //这是普通块
        {
            int uu=10;
            Demo demox=new Demo();
            System.out.println(uu);
        }
    }

    public static void b(){
        Test bb = new Test();
        System.out.println("----执行b");
    }

    //构造块 -2
    {
        System.out.println("----执行构造块");
    }

    //静态块  -1

    static {

        System.out.println("----执行静态块,只执行一次");
    }

    public Test(){
        System.out.println("----执行构造器");
    }


    public static void main(String[] args) {
        Test bb = new Test();
        bb.b();
        Test02 cc = new Test02();

        new java.sql.Date(1000L);
        System.out.println(Math.random());
        new ArrayList<>();

        System.out.println(Math.random());
        System.out.println(Math.PI);


    }
}
