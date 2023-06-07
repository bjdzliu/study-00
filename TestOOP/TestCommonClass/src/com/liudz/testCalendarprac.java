package com.liudz;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Calendar;
import java.util.Scanner;


public class testCalendarprac {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("");
//        String strDate=sc.next();

        String strDate="2022-10-22";
        java.sql.Date date = java.sql.Date.valueOf(strDate);
        //date ---> calender
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
    }




}
