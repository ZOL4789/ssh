package com.zol.ssh.dao;

import com.zol.ssh.entity.User;

public interface UserDAO {
    User queryUserById(int id);
}
