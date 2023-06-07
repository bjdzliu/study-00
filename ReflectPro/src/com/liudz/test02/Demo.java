package com.liudz.test02;

public class Demo {

    public static void main(String[] args) {
        Class c1= Person.class;
        Class c2= Comparable.class;
        Class c3=Override.class;


        int[] arr1 ={1,2,3};
        Class c4 = arr1.getClass();
        int[] arr2={3,4,5};
        Class c5=arr2.getClass();

        System.out.println(c4==c5);

        Class c6=int.class;
        Class c7 = void.class;

        //以上的对象的字节码信息，都是class的一个实例


    }
}
