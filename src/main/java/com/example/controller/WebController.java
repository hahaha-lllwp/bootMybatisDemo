package com.example.controller;

import com.example.model.GraduateInfo;
import com.example.model.User;
import com.example.service.GraduateService;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
public class WebController {

    @Resource
    private GraduateService graduateService;

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public User getUser(String name,long id,int age){
        return new User(id,name,age,"123456");
    }

    @RequestMapping("/saveUser")
    public void saveUser(@Valid User user, BindingResult result) {
        System.out.println("user:"+user);
        if(result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error.getCode() + "-" + error.getDefaultMessage());
            }
        }
    }

    @RequestMapping("/getInfo")
    public GraduateInfo getINfo(long id){
        return graduateService.getById(id);
    }
}
