package com.baizhi.service;

import com.baizhi.dao.EmsUserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmsUserServiceImpl implements EmsUserService {
    @Autowired
    private EmsUserDao userDao;


    @Override
    public User login(String name, String password) {
        User login = userDao.login(name, password);
        return login;
    }

    @Override
    public void regist(User user) {
        userDao.regist(user);
    }
}
