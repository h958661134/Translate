package com.project.trans.Service;

import com.project.trans.Bean.Data;

import java.util.List;

public interface DataService {
    public List<Data> selectall();

    public List<Data> selectdata(Integer tId);

    public void insertdata(Data data);
}