package com.baizhi.service;

import com.baizhi.entity.User;

public interface EmsUserService {
    User login(String name, String password);

    void regist(User user);
}
