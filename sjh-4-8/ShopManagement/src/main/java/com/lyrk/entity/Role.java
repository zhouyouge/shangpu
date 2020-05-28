package com.lyrk.entity;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
    private Integer  id;
    private String roleName;
    private Date ro_createDate;
    private Date ro_modificationDate;
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
