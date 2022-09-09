package com.wy;

import com.wy.entity.Dept;
import com.wy.entity.Employee;
import com.wy.mapper.EmployeeMapper;
import com.wy.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: wangyu
 * @Date: 2022/09/09/15:03
 */

@SpringBootTest
public class EmployeeApplicationTest {


    @Resource
    private EmployeeMapper employeeMapper;

    @Resource
    private EmployeeService employeeService;


    @Test
    void insertEmp() {

        List<Employee> empList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Employee emp = new Employee();
            emp.setDeptId(3);
            emp.setEmpName("崔振博" + i);
            emp.setEmpAddr("北京昌平" + i);
            emp.setEmpBirthday(new Date());
            emp.setEmpEmail("cv5b7" + i + "@163.com");
            emp.setEmpGender("男");
            emp.setEmpPhone("13086839961");
            emp.setEmpPic("cuizhenbo" + i + ".png");
            emp.setEmpEntryDate(new Date());
            empList.add(emp);
        }


        this.employeeService.saveBatch(empList);
    }


    @Test
    void test1() {
        this.employeeMapper.selectList(null).forEach(System.out::println);

    }


}
