package com.jiao.quanjiastore.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiao.quanjiastore.entity.Dish;
import com.jiao.quanjiastore.mapper.DishMapper;
import com.jiao.quanjiastore.service.DishService;
import org.springframework.stereotype.Service;

/**
 * @Author: Jiao
 * @Date: 2023/3/1 20:06
 */

@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
}
