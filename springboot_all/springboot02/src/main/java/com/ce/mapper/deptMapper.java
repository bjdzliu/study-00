package com.ce.mapper;

import com.ce.pojo.dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface deptMapper {
     List<dept> selectAll();

     List<dept> findByDeptno(int deptno);


}
