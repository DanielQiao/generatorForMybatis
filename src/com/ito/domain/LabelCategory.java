package com.ito.domain;

import java.util.Date;

public class LabelCategory {
    /** */
    private Long id;

    /** 标签类别名称*/
    private String categoryName;

    /** 标签类别编码*/
    private String categoryCode;

    /** 标签类别等级 first：一级 second：二级*/
    private String categoryLevel;

    /** 标签类别排序号*/
    private Integer categoryOrder;

    /** 标签类别说明*/
    private String categoryDesc;

    /** 创建时间*/
    private Date createTime;

    /** 创建人id*/
    private Long createId;

    /** 更新时间*/
    private Date updateTime;

    /** 更新人id*/
    private Date updateId;

    /** 删除标识-1：删除，0：未删除*/
    private Integer deleteFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    public String getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(String categoryLevel) {
        this.categoryLevel = categoryLevel == null ? null : categoryLevel.trim();
    }

    public Integer getCategoryOrder() {
        return categoryOrder;
    }

    public void setCategoryOrder(Integer categoryOrder) {
        this.categoryOrder = categoryOrder;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc == null ? null : categoryDesc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Date updateId) {
        this.updateId = updateId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}