package com.project.trans.Controller;

import com.project.trans.Bean.Manage;
import com.project.trans.Service.manageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

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

    /**
     * 查询所有管理员
     * @return
     */
    @RequestMapping("/super/selectallmanage")
    public List<Manage> selectallmanage(){
        return manageService.selectAllManage();
    }

    /**
     * 添加超级管理员
     * @param manage
     */
    @RequestMapping("/super/insertmanage")
    public void insertmanage(Manage manage){
        manageService.insertManage(manage);
    }

    /**
     * 根据id删除超级管理员
     * @param id 超级管理员id
     */
    @RequestMapping("/super/deletemanage")
    public void deletemanage(int id){
        manageService.deleteManage(id);
    }

    /**
     * 更新超级管理员
     * @param manage
     */
    @RequestMapping("/super/updatemanage")
    public void updatemanage(Manage manage){
        manageService.updateManage(manage);
    }

    /**
     * 根据用户名查询超级管理员
     * @param userName
     * @return
     */
    @RequestMapping("/super/searchmanage")
    public List<Manage> searchmanage(String userName){
        return manageService.searchManage(userName);
    }
}
