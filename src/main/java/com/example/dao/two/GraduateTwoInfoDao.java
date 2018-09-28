package com.example.dao.two;

import com.example.model.GraduateInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("graduateTwoInfoDao")
public interface GraduateTwoInfoDao {
    int deleteByPrimaryKey(long id);

    int insert(GraduateInfo record);

    int insertSelective(GraduateInfo record);

    GraduateInfo selectByPrimaryKey(long id);

    int updateByPrimaryKeySelective(GraduateInfo record);

    int updateByPrimaryKey(GraduateInfo record);
}