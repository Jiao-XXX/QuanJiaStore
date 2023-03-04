package com.jiao.quanjiastore.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiao.quanjiastore.common.BaseContext;
import com.jiao.quanjiastore.entity.ShoppingCart;
import com.jiao.quanjiastore.mapper.ShoppingCartMapper;
import com.jiao.quanjiastore.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/**
 * @Author: Jiao
 * @Date: 2023/3/4 15:30
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {


    /**
     * 清空购物车
     */
    @Override
    public void clean() {

        //SQL:delete from shopping_cart where user_id = ?

        LambdaQueryWrapper<ShoppingCart> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ShoppingCart::getUserId, BaseContext.getCurrentId());

        this.remove(queryWrapper);
    }
}
