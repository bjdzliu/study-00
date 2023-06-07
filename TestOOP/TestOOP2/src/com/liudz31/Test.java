package com.liudz31;



public class Test {
    public static void main(String[] args) {

        Girl g=new Girl();
        Animal aa=new Dog();
        g.play(aa);

        Animal bb= PetStore.getAnimal("狗");
        g.play(bb);
    }

}
