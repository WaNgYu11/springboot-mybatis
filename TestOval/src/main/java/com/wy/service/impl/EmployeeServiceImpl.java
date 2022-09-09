package com.wy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wy.entity.Employee;
import com.wy.mapper.EmployeeMapper;
import com.wy.service.EmployeeService;
import com.wy.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: wangyu
 * @Date: 2022/09/09/15:07
 */


@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
