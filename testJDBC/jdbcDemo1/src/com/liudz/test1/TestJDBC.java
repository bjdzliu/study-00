package com.liudz.test1;

import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) throws SQLException {

        //1 添加driver
        Driver driver = new com.mysql.cj.jdbc.Driver();

        //2 注册
        DriverManager.registerDriver(driver);

        //3 获得连接

        String url = "jdbc:mysql://txvm2:12345/mydb?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
        String user = "root";
        String password="123456";

        Connection conn = DriverManager.getConnection(url, user, password);

        //CREATE DATABASE `mydb` CHARACTER SET utf8 COLLATE utf8_general_ci;
       Statement statement = conn.createStatement();
       String sql1="select * from dept";
        String sql2="insert into dept values(60,'教学','上海')";
       Boolean result=statement.execute(sql1);
        int rows = statement.executeUpdate(sql2);

        System.out.println(result);
        System.out.println("影响的行数"+rows);

       statement.close();
       conn.close();


    }
}
