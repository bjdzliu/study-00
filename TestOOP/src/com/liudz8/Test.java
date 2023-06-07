package com.liudz8;

public class Test {
    public static void main(String[] args) {
        Girl g=new Girl();
        g.shezhiAge(20);
        System.out.println(g.duquAge());

        Student s1= new Student();
        s1.setName("nana");
        s1.setAge(19);
        s1.setSex("女");
        System.out.println(s1.getName()+"---"+s1.getAge()+"----"+s1.getSex());

        Student s2 = new Student(18,"菲菲","asdfasdfsadf");
        System.out.println(s2.getName()+"---"+s2.getAge()+"----"+s2.getSex());


    }
}
