package com.project.trans.Mapper;

import com.project.trans.Bean.User;

import java.util.List;

public interface Usermapper {
    /*
    * 查找所有用户
    * */
    public List<User> selectAllUser();

    /*
    * 查询用户密码
    * */
    public String selectpassWord(String userName);

    /*
    *查询用户权限
     */
    public int selectPower(String userName);

    /*
    * 插入用户
    * */
    public void insertUser(User user);

    /*
    * 修改用户密码
    * */
    public void updatePass(User user);


    /**
     * 删除
     * @param id
     */
    public void deluser(int id);

    /**
     * 修改用户信息
     * @param user
     */
    public void updateuser(User user);

    /**
     * 根据用户名模糊查询
     * @param userName
     * @return
     */
    public List<User> selectuser(String userName);
}
