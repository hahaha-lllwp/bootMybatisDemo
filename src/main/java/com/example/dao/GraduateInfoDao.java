package com.example.dao;

import com.example.model.GraduateInfo;
import org.springframework.stereotype.Service;

public interface GraduateInfoDao {
    int deleteByPrimaryKey(long id);

    int insert(GraduateInfo record);

    int insertSelective(GraduateInfo record);

    GraduateInfo selectByPrimaryKey(long id);

    int updateByPrimaryKeySelective(GraduateInfo record);

    int updateByPrimaryKey(GraduateInfo record);
}