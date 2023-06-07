package com.liudz.test02;

import java.io.Serializable;

public class Person implements Serializable {
    private int age;
    public  String name;

    private void eat() {
        System.out.println("person------eat");
    }

    private void sleep() {
        System.out.println("person-----sleep");
    }

}
