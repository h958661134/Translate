package com.project.trans.Service;

import com.project.trans.Bean.Feedback;
import com.project.trans.Bean.Manage;

import java.util.List;

public interface indexService {
    public List<Manage> selectmanage();
    public void userfeedback(Feedback feedback);
}
