package com.liudz11;

public class Person {
    int age;
    String name;

    public Person() {

    }

    Person(int age)  {
        System.out.println("in person age is: " + age);
    }

    Person(int age,String name) {
        System.out.println("in person age is: " + age);
    }

   //default 修饰符
    void run() {
        System.out.println("person is running");
    }

}
