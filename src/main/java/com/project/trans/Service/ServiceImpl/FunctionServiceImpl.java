package com.project.trans.Service.ServiceImpl;

import com.project.trans.Bean.Function;
import com.project.trans.Mapper.Functionmapper;
import com.project.trans.Service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunctionServiceImpl implements FunctionService {
    @Autowired
    private Functionmapper functionmapper;

    @Override
    public List<Function> selectall() {
        return functionmapper.selectAllFunction();
    }

    @Override
    public List<Function> selectfunction(String fName,Integer id)
    {
        return functionmapper.selectfunction(fName,id);
    }
}
