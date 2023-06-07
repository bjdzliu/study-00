package com.liudz01;

public class Student {
    private String name;
    private int age;
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

    public void setSex(String sex) throws Exception {
        if(sex.equals("男")||sex.equals("女")){
            this.sex=sex;
        }else{
            throw new Exception();
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Student(){

    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
//        this.sex = sex;
        try {
        this.setSex(sex);
        }catch(Exception e){
            System.out.println("----制造异常-打印出来了");
            e.printStackTrace();

        }

    }
}
