package com.example.demomybatis;

import com.example.service.GraduateService;
import org.junit.Test;

import javax.annotation.Resource;

public class MybatisTest extends DemoMybatisApplicationTests{

    @Resource
    private GraduateService graduateService;

    @Test
    public void get(){
        System.out.println(
        graduateService.getById(1)
        );
    }
}
