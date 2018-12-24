package com.project.trans.Mapper;

import com.project.trans.Bean.Function;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Functionmapper {
    /**
     * 查找所有功能
     * @return
     */
    public List<Function> selectAllFunction();

    /**
     * 根据功能名和功能id模糊查询
     * @param fName
     * @return
     */
    public List<Function> selectfunction(@Param("fName") String fName, @Param("id") Integer id);
}
