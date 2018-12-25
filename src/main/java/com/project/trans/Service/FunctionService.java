package com.project.trans.Service;

import com.project.trans.Bean.Function;

import java.util.List;

public interface FunctionService {
    public List<Function> selectall();

    public List<Function> selectfunction(String fName,Integer id);
}