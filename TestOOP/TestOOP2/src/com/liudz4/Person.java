package com.liudz4;

public abstract class Person {
    public void eat(){
        System.out.println("person is eating");
    }
    public abstract void run();
}

//在一个class文件中，只能有一个public类，被修饰
class Student extends Person{
    public static void main(String[] args) {
        Student s = new Student();
        s.eat();
        s.run();
    }
    public void eat(){
        System.out.println();
        System.out.println(Math.random());

    }

    @Override
    public void run() {
        System.out.println("run");
    }
}
