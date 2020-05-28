package com.lyrk.entity;

import java.io.Serializable;
import java.util.Date;

public class User_role  implements Serializable {
    private Integer  id;
    private Integer userId;
    private Integer  roleId;
    private Date ru_createDate;
    private Date ru_modificationDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
