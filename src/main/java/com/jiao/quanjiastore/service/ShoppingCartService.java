package com.jiao.quanjiastore.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiao.quanjiastore.entity.ShoppingCart;

/**
 * @Author: Jiao
 * @Date: 2023/3/4 15:27
 */
public interface ShoppingCartService extends IService<ShoppingCart> {

    /**
     * 清空购物车
     */
    public void clean();
}
