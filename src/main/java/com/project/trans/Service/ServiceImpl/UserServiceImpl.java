package com.project.trans.Service.ServiceImpl;

import com.project.trans.Bean.User;
import com.project.trans.Mapper.Usermapper;
import com.project.trans.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private Usermapper usermapper;

    @Override
    public List<User> selectall() {
        return usermapper.selectAllUser();
    }

    @Override
    public void insertuser(User user) {
        usermapper.insertUser(user);
    }

    @Override
    public void deluser(int id) {
        usermapper.deluser(id);
    }

    @Override
    public void updateuser(User user) {
        usermapper.updateuser(user);
    }

    @Override
    public List<User> selectuser(String userName) {
        return usermapper.selectuser(userName);
    }

    @Override
    public String selectpassword(String userName) {
        return usermapper.selectpassWord(userName);
    }

    @Override
    public String selectmanagepass(String manageName) {
        return usermapper.selectmanagerpassword(manageName);
    }
}
