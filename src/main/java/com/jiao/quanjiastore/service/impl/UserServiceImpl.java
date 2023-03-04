package com.jiao.quanjiastore.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiao.quanjiastore.entity.User;
import com.jiao.quanjiastore.mapper.UserMapper;
import com.jiao.quanjiastore.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: Jiao
 * @Date: 2023/3/3 11:39
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
