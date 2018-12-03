package com.project.trans;

import com.baidu.aip.nlp.AipNlp;
import com.project.trans.Bean.User;
import com.project.trans.Mapper.Usermapper;
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

    @Test
    public void contextLoads() {
        ecnet e = new ecnet();
        System.out.println(e.depParser("百度是一家人工只能公司"));
    }

    @Test
    public void functest(){
        String APP_ID = "14494753";
        String API_KEY = "7ANhhaOxKwfH4opIKa1bEbj1";
        String SECRET_KEY = "yx1D7tUmul8Gx5CU4kglPTqqUMmzBgz4";

        String text="我们是译者项目小组";
        AipNlp client = new AipNlp(APP_ID, API_KEY, SECRET_KEY);
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        JSONObject res = client.lexer(text, null);
        String word = "张飞";

        // 传入可选参数调用接口
        HashMap<String, Object> options = new HashMap<String, Object>();

        // 词向量表示
        JSONObject res1 = client.wordEmbedding(word, options);
        System.out.println(res1.toString(2));
    }

}
