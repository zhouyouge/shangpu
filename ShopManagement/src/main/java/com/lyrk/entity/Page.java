package com.lyrk.entity;

import java.io.Serializable;

public class Page implements Serializable{

    /**
     * 当前页码
     */
    private Integer curPage=1;
    /**
     * 页尺寸
     * 每页显示的数据条数
     */
    private Integer PageSize=5;
    /**
     * 查询的结果总数量
     */
    private Integer totalCount;
    /**
     * 总页数
     */
    private Integer totalPageCount;
    /**
     * limit分页的当前条数
     */
    private Integer PageIndex;

    private String  orderBy;
    private String  orderType="desc";

    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public Integer getPageIndex() {
        return PageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        PageIndex = pageIndex;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}


