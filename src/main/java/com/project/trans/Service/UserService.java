package com.project.trans.Service;

import com.project.trans.Bean.User;

import java.util.List;

public interface UserService {
    public List<User> selectall();
    public void insertuser(User user);
    public void deluser(int id);
    public void updateuser(User user);
    public List<User> selectuser(String userName);
}
