package com.project.trans.Controller;

import com.project.trans.Bean.User;
import com.project.trans.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有用户信息，用以展示
     * @return
     */
    @RequestMapping("/user/selectall")
    public List<User> selectall(){
        return userService.selectall();
    }

    /**
     * 插入用户信息
     * @param user
     */
    @RequestMapping("/user/insertuser")
    public void insertuser(User user){
        userService.insertuser(user);
    }

    /**
     * 删除
     * @param id
     */
    @RequestMapping("/user/deluser")
    public void deluser(int id){
        userService.deluser(id);
    }

    /**
     * 修改
     * @param user
     */
    @RequestMapping("/user/updateuser")
    public void updateuser(User user){
//        System.out.println(user.getId());
        userService.updateuser(user);
    }

    /**
     * 查询，用以搜索
     * @param userName
     * @return
     */
    @RequestMapping("/user/selectuser")
    public List<User> selectuser(String userName){
//        System.out.println(userName);
        return userService.selectuser(userName);
    }
}
