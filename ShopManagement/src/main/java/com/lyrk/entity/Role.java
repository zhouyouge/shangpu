package com.lyrk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
    private Integer  id;
    private String roleName;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date ro_createDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date ro_modificationDate;
    private String roleStatus;
    private String comment;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
}
