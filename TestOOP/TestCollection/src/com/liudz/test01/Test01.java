package com.liudz.test01;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
collection的增删改查操作
 */

public class Test01 {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        Collection c2ol=new ArrayList();
        Collection col3=new ArrayList();

        //回忆之前的知识点
        String[] strArry=new String[]{"123","abcd"};
        System.out.println(Arrays.toString(strArry));


        //调用方法
                /*
        Collection接口的常用方法：
        增加：add(E e) addAll(Collection<? extends E> c)
        删除：clear() remove(Object o)
        修改：
        查看：iterator() size()
        判断：contains(Object o)  equals(Object o) isEmpty()
         */

        //集合的特点，只能存放引用类型的数据，但是add(18)成功了，为什么?
        //基本数据类型，自动装箱，18包装成Integer类型。  int---> Integer

        col.add(18);
        col.add(12);
        col.add(11);
        col.add(17);
        System.out.println(col.toString());
        System.out.println(col);

        //asList 返回list
        List list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6});
        col.addAll(list);
        System.out.println(col);

        //col.clear();

        System.out.println("col的size大小是"+col.size());
        System.out.println("col是否是Empty的"+col.isEmpty());

        //删除一个元素
        Boolean isRemove=col.remove(1);
        System.out.println("col是否是被删除了"+isRemove);



        Collection col2 = new ArrayList();
        col2.add(18);
        col2.add(12);
        col2.add(11);
        col2.add(17);

        System.out.println(col.equals(col2));

        //查看地址是否相等,一定不是相等的
        System.out.println(col==col2);

        //是否包含元素
        System.out.println("是否包含元素："+col2.contains(117));


    }
}
