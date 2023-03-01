package com.jiao.quanjiastore.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiao.quanjiastore.common.CustomException;
import com.jiao.quanjiastore.entity.Category;
import com.jiao.quanjiastore.entity.Dish;
import com.jiao.quanjiastore.entity.Setmeal;
import com.jiao.quanjiastore.mapper.CategoryMapper;
import com.jiao.quanjiastore.service.CategoryService;
import com.jiao.quanjiastore.service.DishService;
import com.jiao.quanjiastore.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Jiao
 * @Date: 2023/3/1 18:01
 */

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    /**
     * 删除前判断
     * @param id
     */
    @Override
    public void remove(Long id) {

        //查询是否关联了商品
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();

        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        int count1 = dishService.count(dishLambdaQueryWrapper);

        if (count1 > 0) {
            throw new CustomException("当前分类下关联了商品，不能删除");
        }

        //查询是否关联了套餐
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();

        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        int count2 = dishService.count(dishLambdaQueryWrapper);

        if (count2 > 0) {
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }

        //删除分类
        super.removeById(id);
    }
}
