package com.lyrk.dao;


import com.lyrk.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao  {
    User getUsers(User users);
}
