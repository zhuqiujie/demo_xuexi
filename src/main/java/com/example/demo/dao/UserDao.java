package com.example.demo.dao;

import com.example.demo.dao.baseDao.MyMapper;
import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao extends MyMapper<User> {
   /* @Select("SELECT * FROM USERINFO WHERE username = #{username}")
    User findByName(@Param("username") String username);

    @Insert("INSERT INTO USERINFO(username, pwd) VALUES(#{username}, #{pwd})")*/
    int insert(@Param("username") String name, @Param("pwd") String password);

}
