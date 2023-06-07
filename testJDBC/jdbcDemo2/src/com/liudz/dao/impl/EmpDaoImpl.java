package com.liudz.dao.impl;

import com.liudz.dao.EmpDao;
import com.liudz.pojo.Emp;

import java.sql.*;

public class EmpDaoImpl implements EmpDao {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://txvm2:12345/mydb?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";

    private static String user = "root";
    private static String password = "123456";

    @Override
    public int addEmp(Emp emp) {
        //向Emp插入一条数据
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int rows = 0;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            String sql = "insert into emp value(DEFAULT ,?,?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql); //这里传入SQL语句
            preparedStatement.setObject(1, emp.getEname());
            preparedStatement.setObject(2, emp.getJob());
            preparedStatement.setObject(3, emp.getMgr());
            preparedStatement.setObject(4, emp.getDate());
            preparedStatement.setObject(5, emp.getSal());
            preparedStatement.setObject(6, emp.getComm());
            preparedStatement.setObject(7, emp.getDeptno());

            //执行CURD
            rows = preparedStatement.executeUpdate(); //这里不再需要传入SQL语句
            System.out.println("成功插入行数" + rows);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != preparedStatement) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != connection) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

        return rows;

    }

    @Override
    public int deleteByEmpno(int empno) {

        //向Emp插入一条数据
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int rows = 0;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            String sql = "delete from emp where empno=?";
            preparedStatement = connection.prepareStatement(sql); //这里传入SQL语句
            preparedStatement.setObject(1, empno);
            //执行CURD
            rows = preparedStatement.executeUpdate(); //这里不再需要传入SQL语句
            System.out.println("成功删除行数" + rows);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != preparedStatement) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != connection) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

        return rows;
    }


}
