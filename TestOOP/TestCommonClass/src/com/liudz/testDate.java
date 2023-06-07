package com.liudz;
import java.util.Date;

public class testDate {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.toString());
        System.out.println(d.getTime());
        System.out.println("当前月份是：  "+d.getMonth());
        System.out.println(d.getYear());
        //建议用System.currentTimeMillis()
        System.out.println(System.currentTimeMillis());
        /*

        本地方法
            public static native long currentTimeMillis();
        具体实现不是通过java写的

         */

        long startTime = System.currentTimeMillis();

        for(int i=0;i<100000;i++){
//            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }

}
