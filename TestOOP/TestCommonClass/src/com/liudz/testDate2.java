package com.liudz;
import java.sql.Date;

public class testDate2 {
    public static void main(String[] args) {
        Date d = new Date(1668835284312L);
        System.out.println(d);
        // sql.Date  是 util.Date的子类
                /*
        (1)java.sql.Date和java.util.Date的区别：
        java.util.Date：年月日  时分秒
        java.sql.Date：年月日
        (2)java.sql.Date和java.util.Date的联系：
        java.sql.Date(子类) extends java.util.Date （父类）
         */


        //[1] util--->sql;
        java.util.Date dateu=new Date(1668835284312L);
        Date datesql=(Date)dateu;
        //输出：2022-11-19
        System.out.println(datesql);

        //利用构造器
        Date datesql2=new Date(dateu.getTime());

        //[2] 父类引用指向子类对象
        //sql---> util
        java.util.Date dateutil=d;
        System.out.println(dateutil);

        //[3]String--->sql.Date:
        Date date4 =  Date.valueOf("2019-3-8");
    }
}
