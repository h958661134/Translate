package com.project.trans.Controller;

import com.project.trans.Service.Sample;
import com.project.trans.Util.*;
import org.apache.ibatis.annotations.Param;
import org.json.JSONObject;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fun1 {
        private Sample sample = new Sample();
        private Trans trans=new Trans();
        private wordEmbedding wordEmbedding=new wordEmbedding();
        private depParser depParser = new depParser();
        private Dnn dnn=new Dnn();
        private sentimentClassify sentimentClassify = new sentimentClassify();
        private keyword keyword=new keyword();
        private topic topic=new topic();

        @RequestMapping("/func1/test")
        public String test(@Param("data1") String data1){
//            System.out.println("data1" + data1);
//            System.out.println(sample.func1(data1));
            return sample.func1(data1);
        }

        @RequestMapping("/func1/trans")
        public String trans(@Param("data1") String data1){
            System.out.println(data1);
            return trans.trans(data1);
        }

        @RequestMapping("/func1/transeng")
        public String transeng(@Param("data1") String data1){
            System.out.println(data1);
            return trans.transEng(data1);
        }

        @RequestMapping("/func1/wordembeding")
        public String wordembeding(@Param("data1") String data1){
            return wordEmbedding.wordEmbedding(data1);
        }

        @RequestMapping("/func1/depParser")
        public String depParser(@Param("data1") String data1){
            return depParser.depParser(data1);
        }

        @RequestMapping("/func1/dnn")
        public String dnn(@Param("data1") String data1){
            return dnn.dnn(data1);
        }

        @RequestMapping("/func1/sentimentClassify")
        public String sentimentClassify(@Param("data1") String data1){
            return sentimentClassify.sen(data1);
        }

        @RequestMapping("/func1/keyword")
        public String keyword(String title,String data1){
            return keyword.keyword(title,data1);
        }

        @RequestMapping("/func1/topic")
        public String topic(String title,String data1){
            return topic.keyword(title,data1);
        }

}
