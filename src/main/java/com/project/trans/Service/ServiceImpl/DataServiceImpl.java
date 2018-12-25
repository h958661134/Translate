package com.project.trans.Service.ServiceImpl;

import com.project.trans.Bean.Data;
import com.project.trans.Bean.Function;
import com.project.trans.Mapper.Datamapper;
import com.project.trans.Mapper.Functionmapper;
import com.project.trans.Service.DataService;
import com.project.trans.Service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private Datamapper datamapper;

    @Override
    public List<Data> selectall() {
        return datamapper.selectAllData();
    }

    @Override
    public List<Data> selectdata(Integer tId)
    {
        return datamapper.selectdata(tId);
    }
}
