package com.ce.service;


import com.ce.pojo.dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface deptService {

    public List<dept> listall();

    public List<dept> findBydept(int deptno);

}
