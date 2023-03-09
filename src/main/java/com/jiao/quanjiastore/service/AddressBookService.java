package com.jiao.quanjiastore.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiao.quanjiastore.entity.AddressBook;

/**
 * @Author: Jiao
 * @Date: 2023/3/4 15:22
 */
public interface AddressBookService extends IService<AddressBook> {

    //设置默认地址
    public void setDefault(AddressBook addressBook);
}
