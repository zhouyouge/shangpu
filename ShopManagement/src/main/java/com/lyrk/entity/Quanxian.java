package com.lyrk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Quanxian  implements Serializable {
    //user
    private Integer userId;//	varchar	10	用户Id
    private String userName;//	varchar	50	用户名
    private String password;//	varchar	50	密码
    private Integer userRank;//	int	10	权限级别
    private String roleName;
    private Date userModificationDate;

    //role
    private Integer  id;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date ro_createDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date ro_modificationDate;
    private String roleStatus;
    private String comment;
    //user-role
    private Integer  roleId;
    private Date ru_createDate;
    private Date ru_modificationDate;


    private Date userCreateTime;

    public Date getUserModificationDate() {
        return userModificationDate;
    }

    public void setUserModificationDate(Date userModificationDate) {
        this.userModificationDate = userModificationDate;
    }
    public Date getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserRank() {
        return userRank;
    }

    public void setUserRank(Integer userRank) {
        this.userRank = userRank;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRo_createDate() {
        return ro_createDate;
    }

    public void setRo_createDate(Date ro_createDate) {
        this.ro_createDate = ro_createDate;
    }

    public Date getRo_modificationDate() {
        return ro_modificationDate;
    }

    public void setRo_modificationDate(Date ro_modificationDate) {
        this.ro_modificationDate = ro_modificationDate;
    }

    public String getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Date getRu_createDate() {
        return ru_createDate;
    }

    public void setRu_createDate(Date ru_createDate) {
        this.ru_createDate = ru_createDate;
    }

    public Date getRu_modificationDate() {
        return ru_modificationDate;
    }

    public void setRu_modificationDate(Date ru_modificationDate) {
        this.ru_modificationDate = ru_modificationDate;
    }
}
