package com.ito.dao;

import com.ito.domain.LabelCategory;

public interface LabelCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LabelCategory record);

    int insertSelective(LabelCategory record);

    LabelCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LabelCategory record);

    int updateByPrimaryKey(LabelCategory record);
}