package com.liudz9;

public class Person {
    private Person eat(){
        System.out.println("eat");
        return new Person();
    }

    public void sleep(){
        System.out.println("sleep");

    }
}


