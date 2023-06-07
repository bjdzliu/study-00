package com.liudz.test01;

/**
 *
 */
public class Test0301 extends Test03{
    static int ss=100;
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void printStr(){

        System.out.println("sout");
    }
    public void test(){

        System.out.println("ssss");

    }

    public static void main(String[] args) {
        Test0301 tt=new Test0301();
        tt.printStr();

    }

}
