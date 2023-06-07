package com.liudz;

import java.util.Arrays;

public class TestArray09 {
    public static void main(String[] args) {

        //初始化
        int[] arry = {1,2,3};
        int[] arry2 = new int[]{1,3,4,5,};

        //动态初始化
        int[] arr3;
        arr3=new int[3];
        arr3[0]=100;

        //arr4 在初始化时，就被赋予值
        int[] arr4 = new int[6];


        System.out.println(Arrays.toString(arr4));




    }
}
