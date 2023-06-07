package com.liudz;

import java.util.Scanner;

public class TestArray12 {

//数组添加元素
    public static void main(String[] args) {
        int[] arry = {9,1,2,3,6,1,22};

        for(int i=0;i<arry.length;i++){
            if(i!=arry.length-1){
                System.out.print(arry[i]+",");
            } else{
                System.out.print(arry[i]+"\n");
            }
        }
        /*
        arry[5]=arry[4];
        arry[4]=arry[3];
        arry[3]=arry[2];
         */
        int index=1;
        for(int i=arry.length-1;i>=(index+1);i--){
            arry[i]=arry[i-1];

        }
        arry[index]=100;

        for(int i=0;i<arry.length;i++){
            if(i!=arry.length-1){
                System.out.print(arry[i]+",");
            } else{
                System.out.println(arry[i]);
            }
        }

        //自定义一个方法
        insertArry(arry,3,99);

        //从键盘输入
        Scanner sc=new Scanner(System.in);
        System.out.println("录入元素位置");
        int inputindex=sc.nextInt();

        System.out.println("录入值");
        int ele=sc.nextInt();

        insertArry(arry,inputindex,ele);



        for(int i=0;i<arry.length;i++){
            if(i!=arry.length-1){
                System.out.print(arry[i]+",");
            } else{
                System.out.print(arry[i]);
            }
        }

    }

    public static void insertArry(int[] arry,int index,int ele){
        for(int i=arry.length-1;i>=(index+1);i--){
            arry[i]=arry[i-1];

        }
        arry[index]=ele;


    }

}
