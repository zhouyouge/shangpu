package com.lyrk.controller;


import com.alibaba.fastjson.JSON;
import com.lyrk.entity.*;
import com.lyrk.service.QuanxianService;
import com.lyrk.util.EmptyUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class QuanxianController {
    @Resource
    private QuanxianService quanxianService;
    @RequestMapping(value = "/addRole",method = RequestMethod.POST)
    @ResponseBody
    public Object addRole(Quanxian quanxian){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(quanxian)){
            if(EmptyUtils.isNotEmpty(quanxian.getRoleName())){
                rs=quanxianService.addRole(quanxian);
                rs.setData("添加成功");
                rs.setFlag(2);
                rs.setResult(true);
            }else{
                rs.setData("角色名称为空");
                rs.setFlag(1);
                rs.setResult(false);
            }
        }else{
            rs.setData("传参为空");
            rs.setFlag(3);
            rs.setResult(false);
        }
        return JSON.toJSON(rs);
    }


    //role全查,查询一起用的信息
    @RequestMapping(value = "/RoleList",method = RequestMethod.POST)
    public Object RoleList ( Model model){
        ResponseResult rs=new ResponseResult();
            QuanxianPage page=quanxianService.RoleList(new QuanxianParameter());
            if(EmptyUtils.isNotEmpty(page.getQuanxianList())){
                rs.setData(page);
                rs.setResult(true);
                rs.setFlag(1);
            }else{
                rs.setData("获取集合为空");
                rs.setResult(false);
                rs.setFlag(2);
            }

        model.addAttribute("RoleList",rs);
        return "queryRoleList";
    }
    //role全查
    @RequestMapping(value = "/noRoleList",method = RequestMethod.POST)
    public Object noRoleList ( Model model){
        ResponseResult rs=new ResponseResult();
        QuanxianPage page=quanxianService.noRoleList();
        if(EmptyUtils.isNotEmpty(page.getQuanxianList())){
            rs.setData(page);
            rs.setResult(true);
            rs.setFlag(1);
        }else{
            rs.setData("获取集合为空");
            rs.setResult(false);
            rs.setFlag(2);
        }

        model.addAttribute("RoleList",rs);
        return "querynoRoleList";
    }


    //删除角色信息
    @RequestMapping(value = "deleteRole",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteRole(@Param("id") int  id, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(id)){
                Quanxian role=new Quanxian();
                role.setId(id);
                rs=quanxianService.deleteRole(role);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSON(rs);
    }

    //显示角色修改的界面
    @ResponseBody
    @RequestMapping(value = "updateRoleShow",method = RequestMethod.POST)
    public Object updateRoleShow(@Param("id") int  id,Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(id)){
                Quanxian quanxian=new Quanxian();
                quanxian.setId(id);
                rs=quanxianService.getRole(quanxian);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSONString(rs);
    }

    //显示角色修改的界面
    @ResponseBody
    @RequestMapping(value = "updatenoRoleShow",method = RequestMethod.POST)
    public Object updatenoRoleShow(@Param("id") int  id,Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(id)){
                Quanxian quanxian=new Quanxian();
                quanxian.setId(id);
                rs=quanxianService.getnoRole(quanxian);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSONString(rs);
    }

    //修改一铺一价信息
    @ResponseBody
    @RequestMapping(value = "updateRole",method = RequestMethod.POST)
    public Object updateAshoprice(Quanxian  quanxian, Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(quanxian)){
                rs=quanxianService.updateRole(quanxian);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSONString(rs);
    }

    //操作user表
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public Object addUser(Quanxian quanxian){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(quanxian)){
                rs=quanxianService.addUser(quanxian);
                rs.setData("添加成功");
                rs.setFlag(1);
                rs.setResult(true);
        }else{
            rs.setData("传参为空");
            rs.setFlag(3);
            rs.setResult(false);
        }
        return JSON.toJSONString(rs);
    }


    //user全查
    @RequestMapping(value = "/UserList",method = RequestMethod.POST)
    public Object UserList ( Model model){
        ResponseResult rs=new ResponseResult();
        QuanxianPage page=quanxianService.UserList(new QuanxianParameter());
        if(EmptyUtils.isNotEmpty(page.getQuanxianList())){
            rs.setData(page);
            rs.setResult(true);
            rs.setFlag(1);
        }else{
            rs.setData("获取集合为空");
            rs.setResult(false);
            rs.setFlag(2);
        }

        model.addAttribute("UserList",rs);
        return "queryUserList";
    }
    //user全查
    @RequestMapping(value = "/noUserList",method = RequestMethod.POST)
    public Object noUserList ( Model model){
        ResponseResult rs=new ResponseResult();
        QuanxianPage page=quanxianService.noUserList(new QuanxianParameter());
        if(EmptyUtils.isNotEmpty(page.getQuanxianList())){
            rs.setData(page);
            rs.setResult(true);
            rs.setFlag(1);
        }else{
            rs.setData("获取集合为空");
            rs.setResult(false);
            rs.setFlag(2);
        }

        model.addAttribute("UserList",rs);
        return "querynoUserList";
    }

    //删除角色信息
    @RequestMapping(value = "deleteUser",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteUser(@Param("userId") int  userId, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(userId)){
                Quanxian users=new Quanxian();
                users.setUserId(userId);
                rs=quanxianService.deleteUser(users);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSON(rs);
    }

    //显示角色修改的界面
    @ResponseBody
    @RequestMapping(value = "updateUserShow",method = RequestMethod.POST)
    public Object updateUserShow(@Param("userId") int  userId,Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(userId)){
                Quanxian quanxian=new Quanxian();
                quanxian.setUserId(userId);
                rs=quanxianService.getUser(quanxian);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSONStringWithDateFormat(rs,"yyyy-MM-dd");
    }

    //修改一铺一价信息
    @ResponseBody
    @RequestMapping(value = "updateUser",method = RequestMethod.POST)
    public Object updateUser(Quanxian  quanxian, Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(quanxian)){
                rs=quanxianService.updateUser(quanxian);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSONString(rs);
    }
    //用户角色对照信息操作
    //修改一铺一价信息
    @ResponseBody
    @RequestMapping(value = "updateUserRole",method = RequestMethod.POST)
    public Object updateUserRole(Quanxian  quanxian, Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(quanxian)){
                rs=quanxianService.updateUserRole(quanxian);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSONString(rs);
    }
    //删除对照表信息

    //显示角色修改的界面
    @ResponseBody
    @RequestMapping(value = "updateUserRoleShow",method = RequestMethod.POST)
    public Object updateUserRoleShow1(@Param("id") int  id ,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(id)){
                Quanxian quanxian=new Quanxian();
                quanxian.setId(id);
                rs=quanxianService.getUserRole(quanxian);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSONStringWithDateFormat(rs,"yyyy-MM-dd");
    }
    //删除角色信息
    @RequestMapping(value = "deleteUserRole",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteUserRole(@Param("id") int  id, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(id)){
                Quanxian users=new Quanxian();
                users.setUserId(id);
                rs=quanxianService.deleteUserRole(users);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSON(rs);
    }
    //role全查,查询一起用的信息
    @RequestMapping(value = "/UserRoleList",method = RequestMethod.POST)
    public Object UserRoleList ( Model model){
        ResponseResult rs=new ResponseResult();
        QuanxianPage page=quanxianService.UserRoleList( );
        if(EmptyUtils.isNotEmpty(page.getQuanxianList())){
            rs.setData(page);
            rs.setResult(true);
            rs.setFlag(1);
        }else{
            rs.setData("获取集合为空");
            rs.setResult(false);
            rs.setFlag(2);
        }
        model.addAttribute("userRoleList",rs);
        return "queryUserRoleList";
    }
    @RequestMapping(value = "/noUserRoleList",method = RequestMethod.POST)
    public Object noUserRoleList ( Model model){
        ResponseResult rs=new ResponseResult();
        QuanxianPage page=quanxianService.noUserRoleList( );
        if(EmptyUtils.isNotEmpty(page.getQuanxianList())){
            rs.setData(page);
            rs.setResult(true);
            rs.setFlag(1);
        }else{
            rs.setData("获取集合为空");
            rs.setResult(false);
            rs.setFlag(2);
        }

        model.addAttribute("noUserRoleList",rs);
        return "noUserqueryRoleList";
    }
    @RequestMapping(value = "/addUserRole",method = RequestMethod.POST)
    @ResponseBody
    public Object addUserRole(Quanxian quanxian){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(quanxian)){
            if(EmptyUtils.isNotEmpty(quanxian.getRoleId())){
                if(EmptyUtils.isNotEmpty(quanxian.getUserId())){
                    if(quanxianService.getUserRoleAdd(quanxian)==-1){
                        rs.setData("添加参数为空");
                        rs.setFlag(4);
                        rs.setResult(false);
                    }else{
                        if(quanxianService.getUserRoleAdd(quanxian)>0){
                            rs.setData("改对照信息已存在");
                            rs.setFlag(5);
                            rs.setResult(false);
                        }else{
                            rs=quanxianService.addUserRole(quanxian);
                        }
                    }
                }else{
                    rs.setData("用户ID为空");
                    rs.setFlag(3);
                    rs.setResult(false);
                }
            }else{
                rs.setData("角色ID为空");
                rs.setFlag(4);
                rs.setResult(false);
            }
        }else{
            rs.setData("传参为空");
            rs.setFlag(5);
            rs.setResult(false);
        }
        return JSON.toJSON(rs);
    }

    @RequestMapping(value = "/usersList",method = RequestMethod.POST)
    @ResponseBody
    public Object usersList(){
        List<Quanxian> list=quanxianService.usersList();
        if(EmptyUtils.isNotEmpty(EmptyUtils.isNotEmpty(list))){
            return JSON.toJSONString(list);
        }else{
            return null;
        }
    }
    @RequestMapping(value = "/rolesList",method = RequestMethod.POST)
    @ResponseBody
    public Object rolesList(Quanxian quanxian){
        if(EmptyUtils.isNotEmpty(quanxianService.usersList().size()!=0)){
            return JSON.toJSONString(quanxianService.rolesList());
        }else{
            return null;
        }
    }
}
