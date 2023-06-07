package com.liudz;

public class Demo {
    int id;
    static int sid;
    public void d(){
        System.out.println(id);
        System.out.println(sid);
        System.out.println("-----");
    }


    static void b(){
        System.out.println(sid);

    }

    public static void main(String[] args) {
        Demo x = new Demo();
        x.d();
        System.out.println(Demo.sid);
    }

}
