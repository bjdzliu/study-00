package com.liudz.test01;

import java.util.ArrayList;



class GenericTest{
    public static void main(String[] args) {

        System.out.println("-----没有加入泛型----");
        ArrayList al0=new ArrayList();
        al0.add(1);
        al0.add("a");
        al0.add(new String[]{"ab","sss"});
        for (Object o : al0) {
            System.out.println(o);
            
        }


        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(1);
        al1.add(2);
        for (Integer integer : al1) {
            System.out.println(integer);
        }




    }

}