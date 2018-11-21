package com.project.trans.Controller;

import com.project.trans.Bean.User;
import com.project.trans.TransApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class DbController {
    @RequestMapping("/")
    public String index(Model model){
        User u1=new User(1,"韩昊天","958661134@qq.com","123",1,"ddd","2018");
        model.addAttribute("singlePerson",u1);
        return "index";
    }
    public static void main(String[] args) {
        SpringApplication.run(DbController.class,args);
    }
}