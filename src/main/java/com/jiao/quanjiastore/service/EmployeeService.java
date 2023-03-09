package com.jiao.quanjiastore.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiao.quanjiastore.common.R;
import com.jiao.quanjiastore.entity.Employee;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Jiao
 * @Date: 2023/2/28 16:55
 */
public interface EmployeeService extends IService<Employee> {

    //员工登录
    public R<Employee> login(HttpServletRequest request, Employee employee);
}
