package com.project.trans;

import com.baidu.aip.nlp.AipNlp;
import com.project.trans.Bean.User;
import com.project.trans.Mapper.Usermapper;
import com.project.trans.Mapper.indexSelectmapper;
import com.project.trans.Util.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransApplicationTests {
    @Autowired
    private indexSelectmapper indexSelectmapper;

    @Test
    public void contextLoads() {
        System.out.println(indexSelectmapper.selectdata().toString());
    }

    @Test
    public void functest(){

    }

}
