package com.aaa.controller;

import com.aaa.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class HelloController {
    @RequestMapping(value = "/hello" ,params = {"username=zsl"})
    public String sayHello(){
        System.out.println("spring mvc 执行了");
        return "success";
    }
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println(user.getAge());
        System.out.println(user.getUname());
        return "success";
    }
    @RequestMapping("/saveUser2")
    public String saveUser2(User user){
        System.out.println(user.getAge());
        System.out.println(user.getUname());
        return "success";
    }
}
