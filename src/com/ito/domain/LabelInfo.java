package com.ito.domain;

import java.util.Date;

public class LabelInfo {
    /** */
    private Long id;

    /** 一级标签类别id*/
    private Long firstCategoryId;

    /** 二级标签类别id*/
    private Long secondCategoryId;

    /** 标签名称*/
    private String labelName;

    /** 标签编码*/
    private String labelCode;

    /** 标签序号*/
    private Integer labelOrder;

    /** 标签描述*/
    private String labelDesc;

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

    public Long getFirstCategoryId() {
        return firstCategoryId;
    }

    public void setFirstCategoryId(Long firstCategoryId) {
        this.firstCategoryId = firstCategoryId;
    }

    public Long getSecondCategoryId() {
        return secondCategoryId;
    }

    public void setSecondCategoryId(Long secondCategoryId) {
        this.secondCategoryId = secondCategoryId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    public String getLabelCode() {
        return labelCode;
    }

    public void setLabelCode(String labelCode) {
        this.labelCode = labelCode == null ? null : labelCode.trim();
    }

    public Integer getLabelOrder() {
        return labelOrder;
    }

    public void setLabelOrder(Integer labelOrder) {
        this.labelOrder = labelOrder;
    }

    public String getLabelDesc() {
        return labelDesc;
    }

    public void setLabelDesc(String labelDesc) {
        this.labelDesc = labelDesc == null ? null : labelDesc.trim();
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