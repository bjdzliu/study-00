package test;

import com.liudz.dao.EmpDao;
import com.liudz.dao.impl.EmpDaoImpl;
import com.liudz.pojo.Emp;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        Emp emp = new Emp(null,"JHON","MANAGER",7839,new Date(),3000.2,190.2,30);
        EmpDao empDao = new EmpDaoImpl();
//        int i = empDao.addEmp(emp);
//        System.out.println(i);

        int deletenum = empDao.deleteByEmpno(7935);

    }
}
