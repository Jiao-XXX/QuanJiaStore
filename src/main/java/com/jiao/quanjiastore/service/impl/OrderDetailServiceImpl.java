package com.jiao.quanjiastore.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiao.quanjiastore.entity.OrderDetail;
import com.jiao.quanjiastore.mapper.OrderDetailMapper;
import com.jiao.quanjiastore.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * @Author: Jiao
 * @Date: 2023/3/4 15:26
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
