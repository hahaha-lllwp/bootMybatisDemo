package com.example.model;

import lombok.Data;

@Data
public class GraduateInfo {
    private long id;

    private String name;

    private String email;

    private String password;

    private Integer gender;

    private String token;

    private Integer expiredtime;

    private Integer age;

    private String schoolName;

    private Integer createTime;

    private Integer updateTime;

    private Integer deleteTime;

}