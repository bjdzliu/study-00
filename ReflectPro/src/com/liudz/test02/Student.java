package com.liudz.test02;

public class Student extends Person{
    //属性
    private int sno;
    double height;
    protected double weight;
    public double score;


    private float fsno;
    private String sweight;

    public String showInfo() {
        return "";
    }

    ;

    private void work() {
        System.out.println("xxx");
    }


    public Student() {
        System.out.println("初始化Student空参构造器");
    }

    private Student(int sno) {
        this.sno = sno;

    }

    Student(int sno, double weight) {
        this.sno = sno;
        this.weight = weight;
    }

    private Student(float fsno, String sweight){
        this.fsno=fsno;
        this.sweight=sweight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", height=" + height +
                ", weight=" + weight +
                ", score=" + score +
                ", fsno=" + fsno +
                ", sweight='" + sweight + '\'' +
                '}';
    }





}
