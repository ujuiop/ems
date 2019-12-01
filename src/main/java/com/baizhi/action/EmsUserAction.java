package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.EmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class EmsUserAction {
    @Autowired
    private EmsUserService userService;
    private User user;
    private String name;
    private String password;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        User login = userService.login(name, password);
        if (login != null) {
            return "loginSuccess";
        } else {
            return "loginError";
        }
    }

    public String regist() {
        userService.regist(user);
        return "loginError";
    }
}