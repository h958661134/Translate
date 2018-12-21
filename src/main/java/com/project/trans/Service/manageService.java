package com.project.trans.Service;

import com.project.trans.Bean.Manage;

import java.util.List;

public interface manageService {
    public List<Manage> selectAllManage();
    public String selectSuperManage(String userName);
    public String selectSuperManagePassword(String userName);
    public List<Manage> searchManage(String userName);
    public void insertManage(Manage manage);
    public void deleteManage(int id);
    public void updateManage(Manage manage);
}
