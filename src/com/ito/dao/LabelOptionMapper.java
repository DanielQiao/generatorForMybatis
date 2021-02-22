package com.ito.dao;

import com.ito.domain.LabelOption;

public interface LabelOptionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LabelOption record);

    int insertSelective(LabelOption record);

    LabelOption selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LabelOption record);

    int updateByPrimaryKey(LabelOption record);
}