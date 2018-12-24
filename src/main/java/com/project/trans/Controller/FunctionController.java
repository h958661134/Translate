package com.project.trans.Controller;

import com.project.trans.Bean.Function;
import com.project.trans.Service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FunctionController {
    @Autowired
    private FunctionService functionService;

    /**
     * 查询所有的功能信息，并展示到页面上
     * @return
     */
    @RequestMapping("/function/selectall")
    public List<Function> selectall(){
        return functionService.selectall();
    }

    /**
     * 根据功能名和功能id查询相应的功能
     * @param fName
     * @param id
     * @return
     */
    @RequestMapping("/function/selectfunction")
    public List<Function> selectfunction(String fName,Integer id){
        return functionService.selectfunction(fName,id);
    }

}
