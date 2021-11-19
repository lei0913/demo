package com.example.demo.mapper;

import com.example.demo.pojo.Contact;
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
public interface ContactMapper {
    List<Contact> queryContactList();

    Contact queryContactByName(String name);
    Contact queryContactByPhone(String phone);

    int addContact(Contact contact);

    int updateContact(Contact contact);

    int deleteContact(Integer id);

}
