package com.liudz;

import java.sql.Date;

public class Datesqltest {
    public static void main(String[] args) {

        Date d = new Date(1665827022462l);
        System.out.println(d);

        //java.util.Date dateu = new java.util.Date();

        java.util.Date dateu = new Date(1665827022462l);

        //util --> sql
        //(Date)dateu: 向下转型（父类转成子类） dateu 转成 sql.date
        Date datesql = (Date)dateu;
        System.out.println(datesql);

        //利用构造器 util -> sql
        Date date3 = new Date(dateu.getTime());
        System.out.println(date3);

        // sql -> util
        java.util.Date dateu2 = date3;

        //string --> sql
        Date date4 = Date.valueOf("2019-09-02");
        System.out.println(date4);



    }
}
