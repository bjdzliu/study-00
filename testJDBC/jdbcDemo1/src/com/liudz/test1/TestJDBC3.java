package com.liudz.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC3 {
    public static void main(String[] args) {

        //初始化
        Statement statement=null;
        Connection conn=null;


        //1 添加driver         //2 注册

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://txvm2:12345/mydb?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
            String user = "root";
            String password = "123456";
//3 创建连接
            conn = DriverManager.getConnection(url, user, password);

            //4 创建语句对象
            //CREATE DATABASE `mydb` CHARACTER SET utf8 COLLATE utf8_general_ci;
            statement = conn.createStatement();
            String sql1 = "select * from dept";
            String sql2 = "insert into dept values(80,'教学','四川')";
            Boolean result = statement.execute(sql1);
            int rows = statement.executeUpdate(sql2);

            System.out.println(result);
            System.out.println("影响的行数" + rows);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (null != statement) {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        if (null != conn) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
