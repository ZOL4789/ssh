package com.zol.ssh.service.impl;

import com.zol.ssh.dao.UserDAO;
import com.zol.ssh.entity.User;
import com.zol.ssh.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User findUserById(int id){
        return userDAO.queryUserById(id);
    }
}
