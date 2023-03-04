package com.jiao.quanjiastore.dto;

import com.jiao.quanjiastore.entity.OrderDetail;
import com.jiao.quanjiastore.entity.Orders;
import lombok.Data;

import java.util.List;

/**
 * @Author: Jiao
 * @Date: 2023/3/4 18:05
 */
@Data
public class OrdersDto extends Orders {

    private List<OrderDetail> orderDetails;
}
