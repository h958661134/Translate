package com.project.trans.Controller;

import com.project.trans.Service.manageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class manageController {
    @Autowired
    private manageService manageService;

    @RequestMapping("/super/issupermanage")
    public boolean issupermanage(HttpSession session){
        String power = manageService.selectSuperManage((String)session.getAttribute("manage"));
        if(power==null){
            return false;
        }
        else{
            return true;
        }
    }

}
