package com.jiao.quanjiastore.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiao.quanjiastore.dto.DishDto;
import com.jiao.quanjiastore.entity.Dish;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Jiao
 * @Date: 2023/3/1 20:05
 */

public interface DishService extends IService<Dish> {

    //新增商品，同时插入商品对应的口味数据，需要操作两张表：dish、dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询商品信息和对应的口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新商品信息，同时更新对应的口味信息
    public void updateWithFlavor(DishDto dishDto);

    //删除商品
    void deleteByIds(List<Long> ids);
}
