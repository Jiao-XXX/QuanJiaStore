package com.jiao.quanjiastore.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jiao.quanjiastore.common.R;
import com.jiao.quanjiastore.dto.DishDto;
import com.jiao.quanjiastore.entity.Dish;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: Jiao
 * @Date: 2023/3/1 20:05
 */

public interface DishService extends IService<Dish> {

    //新增商品，同时插入商品对应的口味数据，需要操作两张表：dish、dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    //商品信息分页查询
    public Page<DishDto> page(Page<Dish> pageInfo,String name);

    //根据id查询商品信息和对应的口味信息
    public DishDto getByIdWithFlavor(Long id);

    // 修改商品
    public void update(DishDto dishDto);

    //更新商品信息，同时更新对应的口味信息
    public void updateWithFlavor(DishDto dishDto);

    //删除商品
    void deleteByIds(List<Long> ids);

    //商品批量删除和单个删除
    public R<String> delete(List<Long> ids);

    //进行停售或者是起售
    public void status(Integer status,List<Long> ids);

    //根据条件查询对应的商品数据
    public List<DishDto> list(Dish dish);
}
