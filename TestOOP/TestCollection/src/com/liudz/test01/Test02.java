package com.liudz.test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
遍历
 */
public class Test02 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(19);
        col.add(12);

        col.add(11);


        System.out.println(col.toString());
        System.out.println(col);

//方式1：
        for(int i =0;i<col.size();i++){
            //怎么根据索引获取
            //没有
            System.out.printf("不能获取到");
        }

        //方式2： 增强for循环
        for (Object o : col) {
            System.out.println(o);

        }
        //3
        Iterator it = col.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
