package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;
import com.example.demo.service.TestInterFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestInterFaceImpl implements TestInterFace{
    @Autowired
    UserDao userDao;

    @Override
    public int testInterFace() {
        return 0;
    }

    @Override
    public User testUser() {
        return new User("zhuqiujie","123456");
    }

    @Override
    public int insertUser(String username, String password) {
        return userDao.insert(username,password);
    }
    @Override
    public List<User> selectALL(){
        return userDao.selectAll();
    }
}
