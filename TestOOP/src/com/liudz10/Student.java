package com.liudz10;

public class Student extends Person {
    double score;
    int age;

    public void study() {
        System.out.println("im studying");

    }

    public void eat() {
        System.out.println("student eat something ");
    }

    public void a() {
        age = 1000;
        System.out.println("in student age is :" + age);
        System.out.println("in person age is :" + super.age);
        super.eat();
        eat();
        this.eat();

    }
}
