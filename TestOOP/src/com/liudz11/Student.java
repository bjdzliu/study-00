package com.liudz11;

public class Student extends Person{
    double score;
    public Student(){
    /* super(); */
    }

    //default 修饰符 同一个包下，都可以用
    Student(int age){
        super(age);
        run();
    }
    public Student(double score){
        this.score=score;
    }

    public Student(int age,String name,double score){
//        this.score=score;
//        this.age=age;
//        super(); 如果构造器中，已经有显示调用super构造器，那么没有super()

        super(age,name);
        this.score=score;
        // this构造器，要放在第一行。
        // this() 不能用，因为和super()不能共存，super()也要放在第一行。
        System.out.println("three values set ok");

    }
}
