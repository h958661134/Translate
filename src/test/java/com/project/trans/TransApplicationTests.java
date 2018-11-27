package com.project.trans;

import com.baidu.aip.nlp.AipNlp;
import com.project.trans.Bean.User;
import com.project.trans.Mapper.Usermapper;
import com.project.trans.Util.Trans;
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
    private Usermapper usermapper;

    @Test
    public void contextLoads() {
        List<User> l = usermapper.selectAllUser();
        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i).toString());
        }
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
        Iterator iterator = res.keys();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            System.out.println(key);
        }
        JSONArray arr1=res.getJSONArray("items");
        StringBuffer item=new StringBuffer();
        for (int i=0;i<arr1.length();i++){
            JSONObject js=arr1.getJSONObject(i);
            item.append(js.get("item")+" ");
        }
        System.out.println(item.toString());

//        /*
//        * 中文DNN语言模型接口用于输出切词结果并给出每个词在句子中的概率值,判断一句话是否符合语言表达习惯。
//        * */
//        String text1 = "床前明月光";
//        // 传入可选参数调用接口
//        HashMap<String, Object> options = new HashMap<String, Object>();
//
//        // DNN语言模型
//        JSONObject res1 = client.dnnlmCn(text1, options);
//        System.out.println(res1.toString(2));
//
//        String word1 = "北京";
//        String word2 = "上海";
//
//        // 传入可选参数调用接口
//        HashMap<String, Object> options1 = new HashMap<String, Object>();
//        options.put("mode", 0);
//
//        // 词义相似度
//        JSONObject res2 = client.wordSimEmbedding(word1, word2, options1);
//        System.out.println(res2.toString(2));
    }

}
