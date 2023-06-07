package com.liudz3;

public class Animal {
    int size;
    public Animal(){

    }

    public Animal(int size){
        this.size=size+20;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void shout(){
        System.out.println("animal is shouting");
    }

}
