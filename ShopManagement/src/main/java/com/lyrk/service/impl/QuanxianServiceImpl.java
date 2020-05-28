package com.lyrk.service.impl;

import com.lyrk.dao.QuanxianDao;
import com.lyrk.entity.*;
import com.lyrk.service.QuanxianService;
import com.lyrk.util.EmptyUtils;
import com.lyrk.util.SecurityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("QuanxianService")
public class QuanxianServiceImpl implements QuanxianService {

    @Resource
    private QuanxianDao quanxianDao;

    @Override
    public ResponseResult addRole(Quanxian quanxian) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(quanxian)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=quanxianDao.addRole(quanxian)>0;
            if(flag){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("添加成功");
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("添加失败");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult updateRole(Quanxian quanxian) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(quanxian)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=quanxianDao.updateRole(quanxian)>0;
            if(flag){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("修改成功");
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("修改失败");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult deleteRole(Quanxian quanxian) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(quanxian)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=quanxianDao.deleteRole(quanxian)>0;
            if(flag){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("删除成功");
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("删除失败");
            }
        }
        return rs;
    }

    @Override
    public QuanxianPage RoleList(QuanxianParameter parameter) {
        if(EmptyUtils.isEmpty(parameter)) {
            parameter =new QuanxianParameter();
        }
        QuanxianPage page=new QuanxianPage();
        List<Quanxian> list=quanxianDao.RoleList(parameter);
        if(list.size()!=0){
            page.setQuanxianList(list);
        }else{
            return null;
        }
     return  page;
    }

    @Override
    public QuanxianPage noRoleList() {
        QuanxianPage page=new QuanxianPage();
        List<Quanxian> list=quanxianDao.noRoleList();
        if(list.size()!=0){
            page.setQuanxianList(list);
        }else{
            return null;
        }
        return  page;
    }

    @Override
    public ResponseResult addUser(Quanxian quanxian) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(quanxian)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            if(EmptyUtils.isNotEmpty(quanxian.getUserName())){
                if(EmptyUtils.isNotEmpty(quanxian.getPassword())){
                    quanxian.setPassword(SecurityUtils.md5Hex(quanxian.getPassword()));
                    boolean flag=quanxianDao.addUser(quanxian)>0;
                    if(flag){
                        rs.setFlag(2);
                        rs.setResult(true);
                        rs.setData("添加成功");
                    }else{
                        rs.setFlag(3);
                        rs.setResult(false);
                        rs.setData("添加失败");
                    }
                } else{
                    rs.setFlag(4);
                    rs.setResult(false);
                    rs.setData("用户密码为空");
                }
            }else{
                rs.setFlag(5);
                rs.setResult(false);
                rs.setData("用户名为空");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult updateUser(Quanxian quanxian) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(quanxian)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            if(EmptyUtils.isNotEmpty(quanxian.getPassword())){
                quanxian.setPassword(SecurityUtils.md5Hex(quanxian.getPassword()));
                boolean flag=quanxianDao.updateUser(quanxian)>0;
                if(flag){
                    rs.setFlag(2);
                    rs.setResult(true);
                    rs.setData("修改成功");
                }else{
                    rs.setFlag(3);
                    rs.setResult(false);
                    rs.setData("修改失败");
                }
            }
        }
        return rs;
    }

    @Override
    public ResponseResult deleteUser(Quanxian quanxian) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(quanxian)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=quanxianDao.deleteUser(quanxian)>0;
            if(flag){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("删除成功");
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("删除失败");
            }
        }
        return rs;
    }

    @Override
    public QuanxianPage UserList(QuanxianParameter parameter) {
        if(EmptyUtils.isEmpty(parameter)) {
            parameter =new QuanxianParameter();
        }
        QuanxianPage page=new QuanxianPage();
        List<Quanxian> list=quanxianDao.UserList(parameter);
        if(list.size()!=0){
            page.setQuanxianList(list);
        }else{
            return null;
        }
        return  page;
    }

    @Override
    public QuanxianPage noUserList(QuanxianParameter parameter) {
        if(EmptyUtils.isEmpty(parameter)) {
            parameter =new QuanxianParameter();
        }
        QuanxianPage page=new QuanxianPage();
        List<Quanxian> list=quanxianDao.noUserList(parameter);
        if(list.size()!=0){
            page.setQuanxianList(list);
        }else{
            return page;
        }
        return  page;
    }

    @Override
    public ResponseResult getRole(Quanxian quanxian) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(quanxian)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            Quanxian quanxian1=quanxianDao.getRole(quanxian);
            if(EmptyUtils.isNotEmpty(quanxian1)){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData(quanxian1);
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("未查询到数据");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult getnoRole(Quanxian quanxian) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(quanxian)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            Quanxian quanxian1=quanxianDao.getnoRole(quanxian);
            if(EmptyUtils.isNotEmpty(quanxian1)){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData(quanxian1);
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("未查询到数据");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult getUser(Quanxian quanxian) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(quanxian)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            Quanxian quanxian1=quanxianDao.getUser(quanxian);
            if(EmptyUtils.isNotEmpty(quanxian1)){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData(quanxian1);
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("未查询到数据");
            }
        }
        return rs;
    }
    //用户角色对照表

    @Override
    public QuanxianPage UserRoleList() {
        QuanxianPage page=new QuanxianPage();
        List<Quanxian> list=quanxianDao.UserRoleList();
        if(list.size()!=0){
            page.setQuanxianList(list);
        }else{
            return page;
        }
        return  page;
    }

    @Override
    public QuanxianPage noUserRoleList() {
        QuanxianPage page=new QuanxianPage();
        List<Quanxian> list=quanxianDao.noUserRoleList();
        if(list.size()!=0){
            page.setQuanxianList(list);
        }else{
            return page;
        }
        return  page;
    }

    @Override
    public ResponseResult updateUserRole(Quanxian quanxian) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(quanxian)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
                boolean flag=quanxianDao.updateUserRole(quanxian)>0;
                if(flag){
                    rs.setFlag(2);
                    rs.setResult(true);
                    rs.setData("修改成功");
                }else{
                    rs.setFlag(3);
                    rs.setResult(false);
                    rs.setData("修改失败");
                }

        }
        return rs;
    }

    @Override
    public ResponseResult addUserRole(Quanxian quanxian) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(quanxian)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=quanxianDao.addUserRole(quanxian)>0;
            if(flag){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("添加成功");
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("添加失败");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult deleteUserRole(Quanxian   quanxian) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(quanxian)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=quanxianDao.deleteUserRole(quanxian)>0;
            if(flag){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("删除成功");
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("删除失败");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult getUserRole(Quanxian quanxian) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(quanxian)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            Quanxian quanxian1=quanxianDao.getUserRole(quanxian);
            if(EmptyUtils.isNotEmpty(quanxian1)){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData(quanxian1);
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("未查询到数据");
            }
        }
        return rs;
    }

    @Override
    public List<Quanxian> usersList() {
        return quanxianDao.usersList();
    }

    @Override
    public List<Quanxian> rolesList() {
        return quanxianDao.rolesList();
    }
    /**
     * 用户添加前判断
     */
    @Override
    public int getUserRoleAdd(Quanxian quanxian) {
        if(EmptyUtils.isNotEmpty(quanxian)){
            if(EmptyUtils.isNotEmpty(quanxian.getUserId())){
                if(EmptyUtils.isNotEmpty(quanxian.getRoleId())){
                    return quanxianDao.getUserRoleAdd(quanxian);
                }else{
                    return -1;
                }

            }else{
                return -1;
            }

        }else{
            return -1;
        }
    }
}
