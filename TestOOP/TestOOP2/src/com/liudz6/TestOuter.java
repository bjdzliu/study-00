package com.liudz6;

public class TestOuter {
    {
        System.out.println("这是构造块");
    }
   static {
       System.out.println("这是静态块");
    }
    public void a(){
        System.out.println("i'm in TestOuter;this is a()");
        //普通块
        {
            System.out.println("this is block");
            class B{

            }
        }

        //a()中的类：A；局部内部类
        class A{
        }

        D d = new D();
        System.out.println(d.name);
        d.method();

    }
    int age = 10;

    //成员内部类-非静态的：class中的叫成员
    public class D {
        int age = 20;
        String name;
        public void method(){
            int age = 30;
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(TestOuter.this.age);
            /*a();*/
        }
    }

    static int static_a =100;
    public static void static_b(){
        System.out.println("static_a");
    }

    static class E{
        //static类中，里面访问static
        public void method() {
            System.out.println(static_a);
            static_b();
        }
    }

}


class  Demo{
    public static void main(String[] args) {
        TestOuter to = new TestOuter();
        to.a();

//静态内部类：创建对象
        //外部类.xxx
        TestOuter.E e = new TestOuter.E();

        //非静态的成员内部类：创建对象的方法：
        TestOuter t = new TestOuter();
        TestOuter.D d = t.new D();
        d.name="this";
        System.out.println(d.name);
    }

}
