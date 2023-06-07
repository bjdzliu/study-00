package com.liudz;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.util.Date的格式化
 */
public class testDate3 {
    public static void main(String[] args) {
        //自定义日期格式
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            //字符串转Date
            Date d = df.parse("2022-11-10 19:20:9");
            System.out.println(d.toString());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        //日期转字符串,格式和我自定义的一样
        String dateStr=df.format(new Date());
        System.out.println(dateStr);

        Date date=new Date();
        //以下都是默认的一些格式
        System.out.println(date.toString());
        System.out.println(date.toGMTString());


    }
}
