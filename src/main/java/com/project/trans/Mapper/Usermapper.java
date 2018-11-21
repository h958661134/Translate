package com.project.trans.Mapper;

import com.project.trans.Bean.User;

import java.util.List;

public interface Usermapper {
    /*
    * 查找所有用户
    * */
    public List<User> selectAllUser() throws Exception;

    /*
    * 查询用户密码
    * */
    public String selectpassWord(String userName) throws Exception;

    /*
    *查询用户权限
     */
    public int selectPower(String userName) throws Exception;

    /*
    * 插入用户
    * */
    public void insertUser(User user) throws Exception;

    /*
    * 修改用户密码
    * */
    public void updatePass(User user) throws Exception;
}
