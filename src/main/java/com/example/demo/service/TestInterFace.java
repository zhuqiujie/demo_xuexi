package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface TestInterFace {
    public int testInterFace();

    public User testUser();

    //插入
    public int insertUser(String username,String password);
    //查找全部
    List<User> selectALL();

}
