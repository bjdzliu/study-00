package com.liudz.test01;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
    @Deprecated
    public void printStr(){
        System.out.println("sout");
    }

    public static void main(String[] args) {
/*
list接口中，常用方法
增删改查判断
比collection的方法，多了一些和索引配合的方法
 */

        List arrayList = new ArrayList();
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add("abc");

        arrayList.add(3,88);
        System.out.println(arrayList);

        arrayList.set(3,999);
        System.out.println(arrayList);

        //用的是index 2 ，不是元素2
        ///在集合中存入的是Integer类型数据的时候，调用remove方法调用的是 arrayList.remove(index);
        arrayList.remove(2);
        arrayList.remove("abc");
        System.out.println(arrayList);


        //按照索引找到元素
        Object o = arrayList.get(0);
        System.out.println(o);














    }
}
