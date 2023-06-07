package com.ibmce.pojo;

public class Pet {
    String name;
    String type;
    public Pet(String petName, String PetType){
      name = petName;
      type = PetType;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }


}
