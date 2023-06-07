package com.liudz;

import java.util.Date;

public class Datetest {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.toString());
        System.out.println(System.currentTimeMillis());

        long startTime = System.currentTimeMillis();
        for (int i =0;i<10000;i++){
            //System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("++++");
        System.out.println(endTime-startTime);
    }


}
