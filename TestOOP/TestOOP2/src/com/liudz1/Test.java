package com.liudz1;

public class Test {
    public static void main(String[] args) {
        Phone p1 = new Phone("华为P40", 2003.22, 2020);
        Phone p2 = new Phone("华为P40", 2003.22, 2020);

        //比较p1 和 p2
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}
