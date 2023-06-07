package com.liudz;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class testDateFormater {

    public static void main(String[] args) {

        DateTimeFormatter df3= DateTimeFormatter.ofPattern("yyyy/MM/dd-hh/mm/ss");
        //localtime -- string
        LocalDateTime lnow = LocalDateTime.now();
        String str=df3.format(lnow);
        System.out.println(str);

    }

}
