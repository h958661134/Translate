package com.project.trans.Service;

import com.project.trans.Bean.Feedback;
import com.project.trans.Bean.Function;
import com.project.trans.Bean.Manage;

import java.util.List;
import java.util.Map;

public interface indexService {
    public List<Manage> selectmanage();
    public void userfeedback(Feedback feedback);
    public void addtime(int id);
    public List<Function> selectdata();
}
