package com.levi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String login(String username, String password, HttpSession session){

        if("levi".equals(username) && "123".equals(password)){
            //登录成功
            //1.保存session
            session.setAttribute("user",username);

            //2.进入主页面
            return "main";
        }

        return "login";
    }
}
