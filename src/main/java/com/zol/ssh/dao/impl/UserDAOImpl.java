package com.zol.ssh.dao.impl;

import com.zol.ssh.dao.BaseHibernateDAO;
import com.zol.ssh.dao.UserDAO;
import com.zol.ssh.entity.User;

public class UserDAOImpl extends BaseHibernateDAO implements UserDAO {

//    private SessionFactory sessionFactory;

//      set方法用于spring Set注入
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }

    public User queryUserById(int id){
        try {
            User user = (User)getSession().get(User.class, id);
            return user;
        }catch (RuntimeException re) {
            throw re;
        } finally{
            closeSession();
        }
    }
}
