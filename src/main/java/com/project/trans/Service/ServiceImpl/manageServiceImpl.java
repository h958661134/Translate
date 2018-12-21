package com.project.trans.Service.ServiceImpl;

import com.project.trans.Bean.Manage;
import com.project.trans.Mapper.managemapper;
import com.project.trans.Service.manageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class manageServiceImpl implements manageService {
    @Autowired
    private managemapper managemapper;

    @Override
    public List<Manage> selectAllManage() {
        return managemapper.selectAllManage();
    }

    @Override
    public String selectSuperManage(String userName) {
        return managemapper.selectSuperManage(userName);
    }

    @Override
    public String selectSuperManagePassword(String userName) {
        return managemapper.selectSuperManagePassword(userName);
    }

    @Override
    public List<Manage> searchManage(String userName) {
        return managemapper.searchManage(userName);
    }

    @Override
    public void insertManage(Manage manage) {
        managemapper.insertManage(manage);
    }

    @Override
    public void deleteManage(int id) {
        managemapper.deleteManage(id);
    }

    @Override
    public void updateManage(Manage manage) {
        managemapper.updateManage(manage);
    }
}
