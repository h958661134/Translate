package com.project.trans.Controller;

import com.project.trans.Service.Sample;
import org.apache.ibatis.annotations.Param;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fun1 {
        private Sample sample = new Sample();

        @RequestMapping("/func1/test")
        public String test(@Param("data1") String data1){
//            System.out.println("data1" + data1);
//            System.out.println(sample.func1(data1));
            return sample.func1(data1);
        }
}
