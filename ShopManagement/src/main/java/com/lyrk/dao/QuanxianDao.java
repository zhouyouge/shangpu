package com.lyrk.dao;

import com.lyrk.entity.Quanxian;
import com.lyrk.entity.QuanxianParameter;
import com.lyrk.entity.ResponseResult;
import com.lyrk.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("QuanxianDao")
public interface QuanxianDao {
/**
 * 添加角色
 *
 */
    int addRole(Quanxian quanxian);
    /**
     * 修改已启用回显
     */
    Quanxian  getRole(Quanxian quanxian);
    /**
     * 修改未启用角色信息回显
     */
    Quanxian  getnoRole(Quanxian quanxian);
    /**
     * 修改角色
     */
    int updateRole(Quanxian quanxian);
    /**
     * 删除角色
     */
    int deleteRole(Quanxian quanxian);
    /**
     * 全查角色表
     */
    List<Quanxian> RoleList(QuanxianParameter parameter);
    /**
     *添加用户
     */
    int addUser(Quanxian quanxian);
    /**
     * 修改回显
     */
    Quanxian  getUser(Quanxian quanxian);
    /**
     * 修改用户
     */
    int updateUser(Quanxian quanxian);
    /**
     * 删除用户
     */
    int deleteUser(Quanxian quanxian);
    /**
     * 用户全查
     */
    List<Quanxian> UserList(QuanxianParameter parameter);

    /**
     * 未启用用户信息查询
     */
    List<Quanxian> noUserList(QuanxianParameter parameter);

    /**
     * 查询未启用的角色信息
     */
    List<Quanxian> noRoleList();
    /**
     * 全查角色和用户对照信息启用
     */
    List<Quanxian>  UserRoleList();
    /**
     *查角色和用户对照信息未启用
     */
    List<Quanxian> noUserRoleList();
    /**
     * 更新用户和角色对照信息
     */
    int updateUserRole(Quanxian  quanxian);
    /**
     * 添加用户角色对照表信息
     */
    int addUserRole(Quanxian  quanxian);
    /**
     * 删除用户和角色对照信息
     */
    int deleteUserRole(Quanxian quanxian);
    /**
     * 修改回显
     */
    Quanxian getUserRole(Quanxian quanxian);

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
