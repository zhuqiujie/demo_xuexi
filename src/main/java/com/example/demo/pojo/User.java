package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="userinfo")
public class User {
    @Column(name="userName")
  private String userName;
    @Column(name="pwd")
  private String pwd;

    public User(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }

    public User() {}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
