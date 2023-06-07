package com.liudz.test1;

import com.liudz.entity.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestJDBC4 {
    public static void main(String[] args) {
        List<Emp> emplist = testQuery();

        for (Emp p : emplist) {
            System.out.println(p);
        }

    }

    public static List<Emp> testQuery(){

        //初始化
        Statement statement = null;
        Connection conn = null;
        ResultSet result = null;
        List<Emp> emplist=null;


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
            String sql1 = "select * from emp";

            result = statement.executeQuery(sql1);
            emplist = new ArrayList<Emp>();


            while (result.next()) {
                System.out.println("有值");

                Date date = result.getDate("HIREDATE");
                System.out.println(date.toString());
                int empnum = result.getInt("empno");
                System.out.println(String.valueOf(empnum) + " " + date.toString());
                String empname = result.getString("ENAME");
                String job = result.getString("job");
                int mgr = result.getInt("mgr");
                Double sal = result.getDouble("sal");
                Double common = result.getDouble("comm");
                int depno = result.getInt("deptno");

                Emp emp = new Emp(empnum,empname,job,mgr,date,sal,common,depno);
                emplist.add(emp);

            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != result) {
                try {
                    result.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
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

        return emplist;

    }

}
