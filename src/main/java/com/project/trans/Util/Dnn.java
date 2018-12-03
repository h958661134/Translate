package com.project.trans.Util;

import com.baidu.aip.nlp.AipNlp;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;

public class Dnn {
    public static final String APP_ID = "14494753";
    public static final String API_KEY = "7ANhhaOxKwfH4opIKa1bEbj1";
    public static final String SECRET_KEY = "yx1D7tUmul8Gx5CU4kglPTqqUMmzBgz4";

    /**
     * dnn语言模型
     *
     * @param text
     * @return
     */

    public String dnn(String text) {
        // 初始化一个AipNlp
        AipNlp client = new AipNlp(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 传入可选参数调用接口
        // 传入可选参数调用接口
        HashMap<String, Object> options = new HashMap<String, Object>();

        // DNN语言模型
        JSONObject res = client.dnnlmCn(text, options);

        Iterator iterator = res.keys();
//        while(iterator.hasNext()){
//            String key = (String) iterator.next();
//            System.out.println(key);
//        }
        JSONArray arr1=res.getJSONArray("items");
        StringBuffer item=new StringBuffer();
        for (int i=0;i<arr1.length();i++){
            JSONObject js=arr1.getJSONObject(i);
            item.append(js.get("word")+"    "+"概率:"+js.get("prob")+"\n");
        }
        item.append("\n\n"+"ppl:"+res.get("ppl"));
        return item.toString();
    }
}
