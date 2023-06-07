package com.liudz.dao;

import com.liudz.pojo.Emp;

public interface EmpDao {

    /**
     * 向数据库emp表中，增加一条数据
     * @param emp 要增加的数据，封装成的emp对象
     * @return 增加成功，返回大于0的整数；失败，返回0
     */
    int addEmp(Emp emp);

    /**
     * 根据员工编号，删除员工信息
     * @param empno
     * @return 删除成功，返回大于0的整数；失败，返回0
     */
    int deleteByEmpno(int empno);


}
