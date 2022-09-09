package com.wy;

import com.wy.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author: wangyu
 * @Date: 2022/09/09/15:03
 */

@SpringBootTest
public class EmployeeApplicationTest {


    @Resource
    private EmployeeMapper employeeMapper;





    @Test
    void insertEmp(){

    }




    @Test
    void test1(){
        this.employeeMapper.selectList(null).forEach(System.out::println);

    }


}
