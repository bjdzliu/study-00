package com.liudz9;

public class Student extends Person{
    public void study(){

    }
    public Student eat(){
        System.out.println("eat in student");
        return new Student();
    }
}
