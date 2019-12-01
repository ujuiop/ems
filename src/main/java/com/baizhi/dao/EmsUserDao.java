package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

public interface EmsUserDao {
    User login(@Param("name") String name, @Param("password") String password);

    void regist(User user);
}
