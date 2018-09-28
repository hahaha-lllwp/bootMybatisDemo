package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
public class User {
    @Min(value = 0, message = "id不能为负数")
    private long id;
    @NotEmpty(message = "名字不能为空")
    private String name;
    @Min(value = 18, message = "未成年不得入内")
    @Max(value = 120, message = "年龄不能超过120")
    private int age;
    @Length(min = 6, max = 18, message = "密码在6到18位之间")
    private String password;
}
