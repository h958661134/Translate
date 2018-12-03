package com.project.trans.Util;

import com.baidu.aip.nlp.AipNlp;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;

public class sentimentClassify {
    public static final String APP_ID = "14494753";
    public static final String API_KEY = "7ANhhaOxKwfH4opIKa1bEbj1";
    public static final String SECRET_KEY = "yx1D7tUmul8Gx5CU4kglPTqqUMmzBgz4";


    /**
     * 情感倾向分析
     *
     * @param text
     * @return
     */
    public String sen(String text) {
        // 初始化一个AipNlp
        AipNlp client = new AipNlp(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 传入可选参数调用接口
        HashMap<String, Object> options = new HashMap<String, Object>();

        // 情感倾向分析
        JSONObject res = client.sentimentClassify(text, options);
//        System.out.println(res.toString(2));

        Iterator iterator = res.keys();
//        while(iterator.hasNext()){
//            String key = (String) iterator.next();
//            System.out.println(key);
//        }
        JSONArray arr1=res.getJSONArray("items");
        StringBuffer item=new StringBuffer();
        for (int i=0;i<arr1.length();i++){
            JSONObject js=arr1.getJSONObject(i);
            item.append("情感极性分类:"+js.get("sentiment")+"\n"+"分类的置信度:"+js.get("confidence")+"\n"+"属于积极类别的概率:"+js.get("positive_prob")+"\n"+"属于消极类别的概率:"+js.get("negative_prob")+"\n");
        }

        return item.toString();
    }
}
