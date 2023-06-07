package com.liudz;

public class TestMain {

    public static void main(String[] args) {
        for(String str:args){
            System.out.println(str);
            method1(1,2,3);
            method1(new int[]{4,5,6,});
            method2(111);

        }
    }

    public static void method1(int...num) {
        System.out.println("-----");
        for(int i:num){
            System.out.println(i);
        }
    }

    public static void method2(int num1,int...num2) {
        System.out.println("-----");
        for(int i:num2){
            System.out.println(i);
        }
        System.out.println(num1);
    }
}
