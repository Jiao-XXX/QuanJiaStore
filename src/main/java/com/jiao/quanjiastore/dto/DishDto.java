package com.jiao.quanjiastore.dto;

import com.jiao.quanjiastore.entity.Dish;
import com.jiao.quanjiastore.entity.DishFlavor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jiao
 * @Date: 2023/3/2 11:39
 */

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
