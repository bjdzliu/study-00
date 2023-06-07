package com.liudz.test04;

/*
泛型方法
 */

public class TestGeneric<E> {
    //不是泛型方法
    public void a(E e) {

    }

    //是泛型方法
    public <T> void b(T t) {

    }

}

class Demo {
    public static void main(String[] args) {
        TestGeneric<String> gt1 = new TestGeneric<>();

        gt1.a("aa");
        gt1.a("bb");

        gt1.b(100);
        gt1.b("this");
    }
}

