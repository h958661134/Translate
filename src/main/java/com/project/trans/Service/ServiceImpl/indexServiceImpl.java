package com.project.trans.Service.ServiceImpl;

import com.project.trans.Bean.Feedback;
import com.project.trans.Bean.Manage;
import com.project.trans.Mapper.indexSelectmapper;
import com.project.trans.Service.indexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class indexServiceImpl implements indexService {
    @Autowired
    private indexSelectmapper indexSelectmapper;

    @Override
    public List<Manage> selectmanage() {
        return indexSelectmapper.selectManager();
    }

    @Override
    public void userfeedback(Feedback feedback) {
        indexSelectmapper.userfeedback(feedback);
    }
}
