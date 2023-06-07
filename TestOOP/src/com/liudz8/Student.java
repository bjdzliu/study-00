package com.liudz8;

public class Student {
    private int age;
    private String name;
    private String sex;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if("男".equals(sex) || "女".equals(sex)){
            this.sex = sex;

        }else{
            this.sex = "男";
        }
        this.sex = sex;
    }

    public Student(){

    }

    public Student(int age,String name , String sex){
        this.age = age;
        this.name = name;
        this.setSex(sex);
    }

}

