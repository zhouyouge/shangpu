package com.lyrk.service.impl;


import com.lyrk.dao.UserDao;
import com.lyrk.entity.ResponseResult;
import com.lyrk.entity.User;
import com.lyrk.service.UserService;
import com.lyrk.util.EmptyUtils;
import com.lyrk.util.SecurityUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public ResponseResult loginUser(User users) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(users)){
            rs.setFlag(0);
            rs.setData("传参为空");
        }
        if(EmptyUtils.isEmpty(users.getUserName())){
            rs.setFlag(1);
            rs.setData("用户名为空");
        }
        if(EmptyUtils.isEmpty(users.getPassword())){
            rs.setFlag(2);
            rs.setData("密码为空");
        }else{
            users.setPassword(SecurityUtils.md5Hex(users.getPassword()));
        }
        System.out.println("serviceimpl user对象："+users.getUserName()+users.getPassword());
        User user=userDao.getUsers(users);
        if(EmptyUtils.isNotEmpty(user)){
            System.out.println("serviceimpl user对象："+user.getUserName()+user.getPassword());
        }else{
            System.out.println("user对象为空");
        }
        if(StringUtils.isEmpty(user)){
            rs.setFlag(2);
            rs.setData("用户名或者密码为空");
        }else{
            rs.setResult(true);
            rs.setFlag(3);
            rs.setData(user);
        }
        return rs;
    }
}
