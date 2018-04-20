package com.example.springboot_jpa_jsp_oracle.controller;

import com.example.springboot_jpa_jsp_oracle.model.Userr;
import com.example.springboot_jpa_jsp_oracle.service.User1Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class User1Controller {
    private static Logger logger= LoggerFactory.getLogger(User1Controller.class);
    @Autowired
    private User1Service user1Service;

    @RequestMapping("/index")
    public String index(Model model){
        logger.info("start");
        List<Userr> userrList =user1Service.findAll();
        if(userrList.size()>0){
            model.addAttribute("user", userrList.get(0));
        }else {
            Userr user=new Userr();
            user.setUserId(1l);
            user.setUserName("user");
            user.setPassword("admin");
            model.addAttribute("user",user);
        }
        logger.info("22222222222222222222");
        return "index";
    }
}
