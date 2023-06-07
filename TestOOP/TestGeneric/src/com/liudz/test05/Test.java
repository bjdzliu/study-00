package com.liudz.test05;

import java.util.ArrayList;
import java.util.List;

/*
泛型参数的继承情况
 */

public class Test {
    public void a(Object o) {

    }

    public void a(int i) {

    }


}

class Demo {
    public static void main(String[] args) {
        Test t = new Test();
        t.a(1);
        t.a("aaa");

        Object obj = new Object();
        String s = new String();
        obj=s;  //多态

        Object[] objarr = new Object[9];
        String[] str = new String[10];
        objarr=str;  //多态

        List<Object> objectListist=new ArrayList<>();
        List<Integer> intelist = new ArrayList<>();
        //strlist=intelist  并列关系。不能继承，没有多态度。


    }
}
