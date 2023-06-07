package com.liudz7;

public class TestOuter {
    public void method(){
    final int num=10;
     //在局部内部中访问到的变量，必须是被final修饰的。
        class A{
            public void a(){
               // num=20; 不能在局部内部类中，修改外部的变量
                System.out.println(num);

            }
        }
    }


}
