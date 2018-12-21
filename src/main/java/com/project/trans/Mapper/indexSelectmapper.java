package com.project.trans.Mapper;

import com.project.trans.Bean.Feedback;
import com.project.trans.Bean.Function;
import com.project.trans.Bean.Manage;

import java.util.List;

public interface indexSelectmapper {
    /**
     * 查询管理员信息
     * @return
     */
    public List<Manage> selectManager();

    public void userfeedback(Feedback feedback);

    public void updatefuncdata(int id);

    public List<Function> selectdata();
}
