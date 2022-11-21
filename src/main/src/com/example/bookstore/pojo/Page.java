package com.example.bookstore.pojo;

import java.util.List;

/*
分页模型对象，
* */
public class Page<T> {
    public static final Integer PAGE_SIZE = 4;
    private Integer PageNo;
    private Integer PageTotal;
    private Integer PageSize =  PAGE_SIZE;
    private Integer PageTotalCount;
    private List<T> items;

    public Integer getPageNo() {
        return PageNo;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }

    public void setPageNo(Integer pageNo) {
        PageNo = pageNo;
    }

    public Integer getPageTotal() {
        return PageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        PageTotal = pageTotal;
    }

    public Integer getPageTotalCount() {
        return PageTotalCount;
    }

    public void setPageTotalCount(Integer pageTotalCount) {
        PageTotalCount = pageTotalCount;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
