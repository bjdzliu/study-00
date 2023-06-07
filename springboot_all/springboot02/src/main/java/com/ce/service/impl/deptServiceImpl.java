package com.ce.service.impl;

import com.ce.mapper.deptMapper;
import com.ce.pojo.dept;
import com.ce.service.deptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class deptServiceImpl implements deptService {

    @Autowired
    private deptMapper deptMapperA;
    @Override
    public List<dept> listall() {
        return deptMapperA.selectAll();
    }

    @Override
    public List<dept> findBydept(int deptno) {
        return deptMapperA.findByDeptno(deptno);
    }


}
