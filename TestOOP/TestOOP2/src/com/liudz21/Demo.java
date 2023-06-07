package com.liudz21;

public class Demo {
    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            public void say() {

            }

            @Override
            public void sleep() {

            }
        };

        Student s = new Student();
        s.sleep();
        s.say();

        Person p3 = new Student();
        p3.say();
        p3.sleep();
    }
}
