package com.liudz;

//查询数组
public class TestArray10 {
    public static void main(String[] args) {

        String[] a = {"a","hh","djdjd"};
        System.out.println(a[1]);

        int index=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]=="gg"){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("查无此数");
        }
    }

    //定义一个方法，查询数组中的元素的索引



}
