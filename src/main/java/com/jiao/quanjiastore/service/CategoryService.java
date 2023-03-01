package com.jiao.quanjiastore.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiao.quanjiastore.entity.Category;

/**
 * @Author: Jiao
 * @Date: 2023/3/1 17:59
 */
public interface CategoryService extends IService<Category> {

    public void remove(Long id);
}
