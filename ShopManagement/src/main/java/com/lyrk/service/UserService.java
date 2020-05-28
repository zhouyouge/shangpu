package com.lyrk.service;


import com.lyrk.entity.ResponseResult;
import com.lyrk.entity.User;

public interface UserService {
    /**
     * 登录接口验证
     */
    ResponseResult loginUser(User users);
}

