package com.liudz8;

public class Girl {
    private int age;
    private int sno;
    private String name;

    public Girl() {

    }

    public int duquAge() {
        return age;
    }

    public void shezhiAge(int age) {
        if (age >= 30) {
            this.age = 18;
        } else {
            this.age = age;
        }

    }
}
