package com.example.dao.one;

import com.example.model.GraduateInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("graduateOneInfoDao")
public interface GraduateOneInfoDao {
    int deleteByPrimaryKey(long id);

    int insert(GraduateInfo record);

    int insertSelective(GraduateInfo record);

    GraduateInfo selectByPrimaryKey(long id);

    int updateByPrimaryKeySelective(GraduateInfo record);

    int updateByPrimaryKey(GraduateInfo record);
}