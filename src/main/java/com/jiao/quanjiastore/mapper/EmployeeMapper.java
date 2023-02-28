package com.jiao.quanjiastore.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jiao.quanjiastore.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Jiao
 * @Date: 2023/2/28 16:53
 */

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
