package com.lyrk.controller;

import com.alibaba.fastjson.JSON;
import com.lyrk.entity.ResponseResult;
import com.lyrk.entity.User;
import com.lyrk.service.UserService;
import com.lyrk.util.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    /*加上responseBody解决返回不是视图时Object对象的问题*/
    public  Object loginUser(User users, HttpSession session){
        System.out.println("login"+users.getPassword()+users.getUserName());
        ResponseResult rs=userService.loginUser(users);
        if(!StringUtils.isEmpty(rs)){
            if(rs.getResult()==true){
                User user=(User)rs.getData();
                if(!StringUtils.isEmpty(user)){
                    session.setAttribute("user",user);
                    System.out.println("serssion"+session.getAttribute("user"));
                }
            }
        }
        return JSON.toJSONString(rs);
    }

    /**
     * 退出登录
     * @param session
     * @return
     */
    /*RESER风格，同一请求get和post是不同的*/
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    public  Object loginOut( HttpSession session){
        User user=(User)session.getAttribute("user");
        if(!StringUtils.isEmpty(user)){
            session.removeAttribute("user");
        }
        ResponseResult rs=new ResponseResult();
        rs.setFlag(1);
        rs.setResult(true);
        return JSON.toJSONString(rs);
    }
}
