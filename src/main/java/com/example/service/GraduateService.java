package com.example.service;

import com.example.dao.one.GraduateOneInfoDao;
import com.example.dao.two.GraduateTwoInfoDao;
import com.example.model.GraduateInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GraduateService {
    @Resource
    private GraduateOneInfoDao graduateOneInfoDao;

    @Resource
    private GraduateTwoInfoDao graduateTwoInfoDao;


    public GraduateInfo getById(long id){
        if (System.currentTimeMillis()%2==0){
            return graduateOneInfoDao.selectByPrimaryKey(id);
        }
        return graduateTwoInfoDao.selectByPrimaryKey(id);
    }
}
