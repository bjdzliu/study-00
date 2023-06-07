package com.liudz5;

public interface TestInterface02 {

    public static final int NUM=10;
    public static  int NUM2=10;
    public abstract void a();

    //非抽象方法---  default修饰符必须
    public default void b(){
        System.out.println("TestInterface 's  b()");
    }

    //非抽象方法 --- static 不可以省略
    //static 不涉及到重写。
    public static void c(){
        System.out.println("TestInterface 中的 方法 c");
    }

}

class Demo implements TestInterface02{
    @Override
    public void a(){

    }

    @Override
    public void b() {
        TestInterface02.super.b();
    }

    public void run(){

        {
            System.out.println("this is pu tong kuai");
        }

        System.out.println("run");

    }


    //重写静态方法
    public static void c(){
        System.out.println(" c() is in Demo");
    }

}

class g implements TestInterface02{
    @Override
    public void a() {

    }

    @Override
    public void b() {
        TestInterface02.super.b();
    }

    public void c(){

    }
}

class A{
    public static void main(String[] args) {
        TestInterface02.c();
        Demo demo = new Demo();
        System.out.println(demo.NUM);
        demo.c();
        Demo.c();
        TestInterface02.c();
        System.out.println(TestInterface02.NUM);
        demo.run();
    }
}

