package com.jiao.quanjiastore.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiao.quanjiastore.entity.Orders;

/**
 * @Author: Jiao
 * @Date: 2023/3/4 15:24
 */

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
