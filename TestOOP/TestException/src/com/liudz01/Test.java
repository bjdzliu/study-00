package com.liudz01;

import java.util.Scanner;

public class Test {


    public static void main(String[] args)  {
  /*      try{
            Scanner sc= new Scanner(System.in);
            System.out.println("please input 1st value");
            int num1=sc.nextInt();
            System.out.printf("please input 2nd value");
            int num2=sc.nextInt();
            System.out.println("result"+num1/num2);

        }catch (Exception ex){
            System.out.println("sorry");
        }finally {
            System.out.println("end");
        }*/

       /* throw new RuntimeException("性别不对");*/

        Student s = new Student();
        s.setName("飞飞");
        s.setAge(10);
        try {
            s.setSex("asdasdasd");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(s);

        Student s2 = new Student("娜娜",21,"asdfasdfasdf");
        System.out.println(s2);

    }
}
