package com.liudz5;

public interface TestInterface01 {

  public static final   int NUM =10;
    // 默认灰色给我补全了
    public abstract void a();
    //1.8之前，接口中只有常量和抽象方法

    //1.8之后
    //default修饰的非抽象方法
    public default void b(){
        System.out.println("-----TestInterface --b()");
    }

/*    不能在 Interface 中 定义普通方法；带default修饰符除外
public void e(){

    }*/

}

class Test implements  TestInterface01{
    public void a(){
        System.out.println("in Test a()");
    }

    //default的修饰符在实现类里不加
    public void b(){
        System.out.println("in Test b()");
    }

    public void c(){
        //使用"实现类"的Test
        b();
//        super.b();
        TestInterface01.super.b();
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.a();
        t.b();
        t.c();
    }
}