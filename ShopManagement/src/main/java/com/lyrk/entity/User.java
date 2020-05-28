package com.lyrk.entity;

import java.util.Date;

public class User {
    private Integer userId;//	varchar	10	用户Id
    private String userName;//	varchar	50	用户名
    private String password;//	varchar	50	密码
    private Integer userRank;//	int	10	权限级别
    private String roleName;
    private Date userCreateTime;//
    private Date userModificationDate;

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

    private Role role;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
}
