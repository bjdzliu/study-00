package com.liudz011;

public interface TestInterface2 {
    public static final int NUM =10;
    public abstract void a();
    public default void b(){
        System.out.println("asdasd");
    }
    public static void c(){
        System.out.println("asdasdasd");
    }
}

class Demo implements TestInterface2{
    @Override
    public void a() {

    }

    public static void c(){
        System.out.println("asdasd");
    }
}

class A{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.c();
        Demo.c();
        TestInterface2.c();
    }
}
