package com.dreamTank.mhl.service;

import com.dreamTank.mhl.dao.EmployeeDAO;
import com.dreamTank.mhl.domain.Employee;
import com.dreamTank.mhl.utils.JDBCUtilsbyDruid;

/**
 * 完成对employee表的各种操作
 */
public class EmployeeService {
    private  EmployeeDAO employeeDAO = new EmployeeDAO();

    public Employee getEmployeeByIdAndPwd(String empid, String pwd){
       return employeeDAO.querySingle("select * from employee where empid =? and pwd = md5(?)", Employee.class,empid,pwd);
    }
}
