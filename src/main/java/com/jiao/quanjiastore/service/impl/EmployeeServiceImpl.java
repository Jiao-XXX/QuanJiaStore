package com.jiao.quanjiastore.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiao.quanjiastore.entity.Employee;
import com.jiao.quanjiastore.mapper.EmployeeMapper;
import com.jiao.quanjiastore.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @Author: Jiao
 * @Date: 2023/2/28 16:57
 */

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
