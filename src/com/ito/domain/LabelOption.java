package com.ito.domain;

import java.math.BigDecimal;
import java.util.Date;

public class LabelOption {
    /** */
    private Long id;

    /** 标签id*/
    private Long labelId;

    /** 标签选项名称*/
    private String optionName;

    /** 标签选项值*/
    private String optionValue;

    /** 区间起始值*/
    private BigDecimal startValue;

    /** 区间结束值*/
    private BigDecimal endValue;

    /** 标签选项单位*/
    private String optionUnit;

    /** 标签选项序号*/
    private Integer optionOrder;

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

    public Long getLabelId() {
        return labelId;
    }

    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue == null ? null : optionValue.trim();
    }

    public BigDecimal getStartValue() {
        return startValue;
    }

    public void setStartValue(BigDecimal startValue) {
        this.startValue = startValue;
    }

    public BigDecimal getEndValue() {
        return endValue;
    }

    public void setEndValue(BigDecimal endValue) {
        this.endValue = endValue;
    }

    public String getOptionUnit() {
        return optionUnit;
    }

    public void setOptionUnit(String optionUnit) {
        this.optionUnit = optionUnit == null ? null : optionUnit.trim();
    }

    public Integer getOptionOrder() {
        return optionOrder;
    }

    public void setOptionOrder(Integer optionOrder) {
        this.optionOrder = optionOrder;
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