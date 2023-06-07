package com.liudz3;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();

        Girl g = new Girl();

        Dog d = new Dog();
        Animal a = d;  //向上转型；
        g.play(a);
        //a.eat() a是Animal，没有eat方法，将它转成dog
        Dog dog1 = (Dog) a;  //向下转型；父类a，转成Dog类 dog1
        dog1.eat();

        Cat c2=new Cat(10);
        System.out.println( c2.getSize());


    }
}
