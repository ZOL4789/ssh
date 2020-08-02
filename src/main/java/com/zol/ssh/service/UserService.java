package com.zol.ssh.service;

import com.zol.ssh.entity.User;

public interface UserService {
    User findUserById(int id);
}
