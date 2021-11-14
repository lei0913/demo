package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ssbfenqi
 * Date:2021/11/13
 * Timme:16:10
 * author: libanglei
 */

@Mapper//注解表示这是一个Mybatis的mapper类
@Repository
public interface UserMapper {
    List<User> queryUserList();

    User queryUserById(Integer id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Integer id);

}
