package com.project.trans.Util;

import com.baidu.aip.nlp.AipNlp;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;

public class ecnet {
    public static final String APP_ID = "14494753";
    public static final String API_KEY = "7ANhhaOxKwfH4opIKa1bEbj1";
    public static final String SECRET_KEY = "yx1D7tUmul8Gx5CU4kglPTqqUMmzBgz4";

    public String depParser(String text) {
        // 初始化一个AipNlp
        AipNlp client = new AipNlp(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 传入可选参数调用接口
        HashMap<String, Object> options = new HashMap<String, Object>();

        // 文本纠错
        JSONObject res = client.ecnet(text, options);
        System.out.println(res.toString(2));

        Iterator iterator = res.keys();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            System.out.println(key);
        }

        JSONObject ar1=res.getJSONObject("item");
//        JSONArray arr1 = ar1.getJSONArray("vec_fragment");

        StringBuffer item=new StringBuffer();
        item.append("原句："+text+"\n\n\n");
        item.append("修改后句子："+ar1.get("correct_query")+"\n");

        return item.toString();
    }
}
