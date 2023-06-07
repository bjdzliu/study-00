package com.liudz11;

public class Teacher extends Person {
    String name;

    public Teacher(int age, String name, String name1) {
        super(age, name);
        this.name = name1;
    }



    public Teacher(String name) {

        super(); //默认省略不写
        this.name = name;
    }

    //macbook : control+enter 添加构造器
    public Teacher() {
    }
}
