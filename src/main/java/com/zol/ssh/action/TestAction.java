package com.zol.ssh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zol.ssh.entity.User;
import com.zol.ssh.service.UserService;

import java.util.Map;

public class TestAction extends ActionSupport {
    private UserService userService;

    //set方法用于spring Set注入
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String test(){
        User user = userService.findUserById(7);
        System.out.println("测试i！");
        ActionContext ac =ActionContext.getContext();
        if(ac != null) {
            Map map = ac.getSession();
            map.put("user", user);
            return "success";
        }
        return "error";
    }
}
