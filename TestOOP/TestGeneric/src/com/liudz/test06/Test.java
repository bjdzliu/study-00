package com.liudz.test06;

import java.util.ArrayList;
import java.util.List;

/*
泛型方法
通配符
 */

public class Test {

    //public void a(List<Object> list){}
    //public void a(List<String> list){}
    public void a(List<Integer> list){}

    public void b(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }


}


class Demo{

    public static void main(String[] args) {
        List<Object> ol = new ArrayList<>();
        List<String> ol2 = new ArrayList<>();
        List<Integer> ol3 = new ArrayList<>();

        List<?> common = null;
        common=ol;
        common=ol2;
        common=ol3;

        Test t = new Test();
        t.b(new ArrayList<String>());
        t.b(new ArrayList<Integer>());

    }
}