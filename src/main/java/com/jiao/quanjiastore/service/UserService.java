package com.jiao.quanjiastore.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiao.quanjiastore.entity.User;

/**
 * @Author: Jiao
 * @Date: 2023/3/3 11:37
 */

public interface UserService extends IService<User> {

    // 移动端用户登录
    public User login(String phone);
}
