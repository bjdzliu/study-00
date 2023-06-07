package com.liudz;

import java.util.Random;

public class testRandom {
    public static void main(String[] args) {

        //0-1之间的随机数
        System.out.println(Math.random());


        //1) 方法1
        long yinzi = System.currentTimeMillis();
        Random r1 =new Random(yinzi);
        System.out.println(yinzi);
        System.out.println(r1.nextInt());

        //2） [0,10) 之间的随机数
        Random r2 = new Random();
        System.out.println(r2.nextInt(10));
        System.out.println(r2.nextDouble());


    }
}
