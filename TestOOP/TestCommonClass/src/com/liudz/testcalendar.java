package com.liudz;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class testcalendar {
    public static void main(String[] args) {
        //GregorianCalendar是Calendar子类，父类Calendar是抽象类
        //抽象类不能直接创建对象
        //方法1：
        Calendar cal= new GregorianCalendar();
        //方法2：
        Calendar cla2=Calendar.getInstance();
        System.out.println(cal);

        //常用的方法：
        //2022
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        //System.out.println(cal.getActualMaximum(Calendar.DATE));

        //set方法
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.DATE,19);
        //从0开始，是1月
        cal.set(Calendar.MONTH,6);
        System.out.println(cal.getActualMaximum(Calendar.DATE));
        System.out.println(cal.get(Calendar.YEAR));

        //String---Calender
        //String--->java.sql.Date
        java.sql.Date date = java.sql.Date.valueOf("1997-09-10");
        //java.sql.Date---> Calendar
        cal.setTime(date);
        System.out.println(cal.get(Calendar.YEAR));




    }
}
