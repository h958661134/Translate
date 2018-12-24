package com.project.trans.Controller;

import com.project.trans.Bean.Data;
import com.project.trans.Bean.Function;
import com.project.trans.Service.DataService;
import com.project.trans.Service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {
    @Autowired
    private DataService dataService;

    /**
     * 查询所有的功能数据，并返回到页面上
     * @return
     */
    @RequestMapping("/data/selectall")
    public List<Data> selectall(){
        return dataService.selectall();
    }

    /**
     * 根据功能id查找对应功能的返回数据内容
     * @param tId
     * @return
     */
    @RequestMapping("/data/selectdata")
    public List<Data> selectdata(Integer tId){
        return dataService.selectdata(tId);
    }

}
