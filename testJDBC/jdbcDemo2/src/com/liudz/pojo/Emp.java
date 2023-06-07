package com.liudz.pojo;

import java.io.Serializable;
import java.util.Date;

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

    public Emp() {
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

    public Integer getEmpnum() {
        return empnum;
    }

    public void setEmpnum(Integer empnum) {
        this.empnum = empnum;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
}
