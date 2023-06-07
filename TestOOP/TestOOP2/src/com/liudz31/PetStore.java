package com.liudz31;

public class PetStore {
     public static Animal getAnimal(String petName){
          Animal an = null;
          if("猫".equals(petName)){
               an = new Cat();
          }
          if("狗".equals(petName)){
               an = new Dog();
          }
          return an;
     }
}
