package com.jiao.quanjiastore.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiao.quanjiastore.dto.DishDto;
import com.jiao.quanjiastore.dto.SetmealDto;
import com.jiao.quanjiastore.entity.Setmeal;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Jiao
 * @Date: 2023/3/1 20:05
 */

public interface SetmealService extends IService<Setmeal> {
    // 新增套餐，同时需要保存套餐和商品的关联关系
    public void saveWithDish(SetmealDto setmealDto);


    // 删除套餐，同时需要删除套餐和商品的关联数据
    public void removeWithDish(List<Long> ids);

    // 根据套餐id修改售卖状态
    void updateSetmealStatusById(Integer status,List<Long> ids);


    // 回显套餐数据：根据套餐id查询套餐
    SetmealDto getDate(Long id);

    // 根据套餐id查询套餐具体内容
    public List<DishDto> getDish(Long id);
}
