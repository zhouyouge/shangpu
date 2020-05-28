package com.lyrk.service;


import com.lyrk.entity.Quanxian;
import com.lyrk.entity.QuanxianPage;
import com.lyrk.entity.QuanxianParameter;
import com.lyrk.entity.ResponseResult;

import java.util.List;

public interface QuanxianService {

    /**
     * 添加角色
     *
     */
    ResponseResult addRole(Quanxian quanxian);
    /**
     * 修改回显
     */
    ResponseResult  getRole(Quanxian quanxian);
    /**
     * 修改角色
     */
    ResponseResult updateRole(Quanxian quanxian);
    /**
     * 删除角色
     */
    ResponseResult deleteRole(Quanxian quanxian);
    /**
     * 全查角色表
     */
    QuanxianPage RoleList(QuanxianParameter parameter);
    /**
     *添加用户
     */
    ResponseResult addUser(Quanxian quanxian);
    /**
     * 修改回显
     */
    ResponseResult  getUser(Quanxian quanxian);
    /**
     * 修改未启用角色信息回显
     */
    ResponseResult  getnoRole(Quanxian quanxian);
    /**
     * 修改用户
     */
    ResponseResult updateUser(Quanxian quanxian);
    /**
     * 删除用户
     */
    ResponseResult deleteUser(Quanxian quanxian);
    /**
     * 未启用用户全查
     */
   QuanxianPage UserList(QuanxianParameter parameter);
    /**
     * 已启用用户全查
     */
    QuanxianPage noUserList(QuanxianParameter parameter);

    /**
     * 查询未启用的角色信息
     */
    QuanxianPage noRoleList();
    /**
     * 全查角色和用户对照信息
     */
    QuanxianPage  UserRoleList();
    /**
     * 全查角色和用户对照信息未启用
     */
    QuanxianPage noUserRoleList();
    /**
     * 更新用户和角色对照信息
     */
    ResponseResult updateUserRole(Quanxian  quanxian);
    /**
     * 添加用户角色对照表信息
     */
    ResponseResult addUserRole(Quanxian  quanxian);
    /**
     * 删除用户和角色对照信息
     */
    ResponseResult deleteUserRole(Quanxian quanxian);
    /**
     * 修改回显
     */
    ResponseResult getUserRole(Quanxian quanxian);
    /**
     * 全查用户表
     */
    List<Quanxian> usersList();
    /**
     * 全查角色表
     */
    List<Quanxian> rolesList();
    /**
     * 用户添加前判断
     */
    int getUserRoleAdd(Quanxian quanxian);
}
