package com.liudz;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class testLocalTime {
    public static void main(String[] args) {
        //1 实例化
        //方法 now
        //输出日期
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //输出时间
        LocalTime locaTime = LocalTime.now();
        System.out.println(locaTime);

        //输出日期和时间
        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println(localDateTime);

        //方法2：of()--设置指定的日期，时间，日期+时间
        //设置日期
        LocalDate lof1=LocalDate.of(2000,12,14);


        //不可变性
        //产生一个新的时间对象
        LocalDateTime localdatetime2 = localDateTime.minusHours(1);

        //localdatetime2对象，get方法
        System.out.println(localdatetime2.getHour());




    }
}
