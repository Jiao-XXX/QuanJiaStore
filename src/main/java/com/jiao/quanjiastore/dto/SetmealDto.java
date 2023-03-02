package com.jiao.quanjiastore.dto;

import com.jiao.quanjiastore.entity.Setmeal;
import com.jiao.quanjiastore.entity.SetmealDish;
import lombok.Data;
import java.util.List;

/**
 * @Author: Jiao
 * @Date: 2023/3/2 18:43
 */

@Data
public class SetmealDto extends Setmeal {
    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
