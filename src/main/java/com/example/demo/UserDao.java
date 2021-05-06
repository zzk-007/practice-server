package com.example.demo;

import javax.persistence.*;

/**
 * USER表格
 * */

@Entity
@Table(name="user_info") //指定表名
public class UserDao {
    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="user_password")
    private String userPassword;

    @Column(name="user_mailbox")
    private String userMailbox;

    @Column(name="user_phone")
    private String userPhone;

    @Column(name="user_token")
    private String userToken;

    @Column(name="user_repository_time")
    private String userRepositoryTime;

    @Column(name="user_login_last_time")
    private String userLoginLastTime;

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserMailbox() {
        return userMailbox;
    }
    public void setUserMailbox(String userMailbox) {
        this.userMailbox = userMailbox;
    }

    public String getUserPhone() {
        return userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserToken() {
        return userToken;
    }
    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getUserRepositoryTime() {
        return userRepositoryTime;
    }
    public void setUserRepositoryTime(String userRepositoryTime) {
        this.userRepositoryTime = userRepositoryTime;
    }

    public String getUserLoginLastTime() {
        return userLoginLastTime;
    }
    public void setUserLoginLastTime(String userLoginLastTime) {
        this.userLoginLastTime = userLoginLastTime;
    }

}

