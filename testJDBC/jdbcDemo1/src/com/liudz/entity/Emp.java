package com.liudz.entity;

import java.io.Serializable;
import java.util.Date;

/*
实体类封装结果集
 */

public class Emp implements Serializable {

    private Integer empnum;
    private String ename;
    private String job;
    private Integer mgr;
    private Date date;
    private Double sal;
    private Double comm;
    private Integer  deptno;

    @Override
    public String toString() {
        return "Emp{" +
                "empnum=" + empnum +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", date=" + date +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }

    public Emp(Integer empnum, String ename, String job, Integer mgr, Date date, Double sal, Double comm, Integer deptno) {
        this.empnum = empnum;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.date = date;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    public Emp(){

    }



    public String getEname() {
        return ename;
    }

    public String getJob() {
        return job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public Date getDate() {
        return date;
    }

    public Double getSal() {
        return sal;
    }

    public Double getComm() {
        return comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public Integer getEmpnum() {
        return empnum;
    }

    public void setEmpnum(Integer empnum) {
        this.empnum = empnum;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
}
