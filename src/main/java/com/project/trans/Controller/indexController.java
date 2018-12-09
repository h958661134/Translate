package com.project.trans.Controller;

import com.project.trans.Bean.Manage;
import com.project.trans.Service.indexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class indexController {
    @Autowired
    private indexService indexService;

    @RequestMapping("/index/indexselectmanage")
    public List<Manage> selectmanage(){
        return indexService.selectmanage();
    }
}
