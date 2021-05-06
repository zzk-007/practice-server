package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserDao,Integer> {
    public List<UserDao> findByUserName(String userName); //通过UserName查询

    public List<UserDao> findByUserMailbox(String userMailbox);//通过Mailbox查询

    public List<UserDao> findByUserToken(String token);//通过UserToken查询

}
