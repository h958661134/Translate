package com.project.trans.Mapper;

import com.project.trans.Bean.Data;
import com.project.trans.Bean.Function;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Datamapper {
    /**
     * 查找所有功能
     * @return
     */
    public List<Data> selectAllData();

    /**
     * 查找相应的功能数据，以及功能数据的返回值
     * @param tId
     * @return
     */
    public List<Data> selectdata(@Param("tId") Integer tId);
}
