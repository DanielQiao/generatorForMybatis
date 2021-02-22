package com.ito.dao;

import com.ito.domain.LabelInfo;

public interface LabelInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LabelInfo record);

    int insertSelective(LabelInfo record);

    LabelInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LabelInfo record);

    int updateByPrimaryKey(LabelInfo record);
}