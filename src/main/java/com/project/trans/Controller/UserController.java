package com.project.trans.Controller;

import com.project.trans.Bean.User;
import com.project.trans.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
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


    /**
     * 用户登录
     * @param username
     * @param password
     * @param session
     * @return
     */
    @RequestMapping("/user/login")
    public boolean login(String username,String password,HttpSession session){
        System.out.println(username);
        if(userService.selectpassword(username)==null){
            return false;
        }
        else if (userService.selectpassword(username).equals(password)){
            session.setAttribute("username",username);
            System.out.println(session.getAttribute("username"));
            return true;
        }
        return false;
    }

    @RequestMapping("/user/managelogin")
    public boolean managelogin(String username,String password,HttpSession session){
        System.out.println(username);
        if(userService.selectmanagepass(username)==null){
            return false;
        }
        else if (userService.selectmanagepass(username).equals(password)){
            session.setAttribute("manage",username);
            System.out.println(session.getAttribute("manage"));
            return true;
        }
        return false;
    }

    /**
     * 注册
     * @param user
     */
    @RequestMapping("/user/regist")
    public boolean regist(User user){
        Date date=new Date();
        user.setUserPower(1);
        user.setUserTime(date.toString());
        if (userService.selectpassword(user.getUserName())==null){
            userService.insertuser(user);
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * 管理员退出
     * @param session
     */
    @RequestMapping("/user/exit")
    public void exit(HttpSession session){
        session.invalidate();
    }

    /**
     * 检测管理员登录状态
     * @param session
     * @return
     */
    @RequestMapping("/user/manageislogin")
    public boolean manageislogin(HttpSession session){
        if (session.getAttribute("manage")==null){
            return true;
        }
        return false;
    }

    /**
     * 检测用户登录状态
     * @param session
     * @return
     */
    @RequestMapping("/user/userislogin")
    public boolean userislogin(HttpSession session){
        if (session.getAttribute("username")==null){
            return true;
        }
        return false;
    }

    /**
     * 查找session名
     * @param session
     * @return
     */
    @RequestMapping("/user/getsession")
    public String getsession(HttpSession session){
        return (String)session.getAttribute("manage");
    }
}
