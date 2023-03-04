package com.jiao.quanjiastore.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiao.quanjiastore.entity.AddressBook;
import com.jiao.quanjiastore.mapper.AddressBookMapper;
import com.jiao.quanjiastore.service.AddressBookService;
import org.springframework.stereotype.Service;

/**
 * @Author: Jiao
 * @Date: 2023/3/4 15:23
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
