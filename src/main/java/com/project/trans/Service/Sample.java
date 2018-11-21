package com.project.trans.Service;
import com.baidu.aip.nlp.AipNlp;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;

public class Sample {
    //设置APPID/AK/SK

    public String func1(String text){
        String APP_ID = "14494753";
        String API_KEY = "7ANhhaOxKwfH4opIKa1bEbj1";
        String SECRET_KEY = "yx1D7tUmul8Gx5CU4kglPTqqUMmzBgz4";

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

        return item.toString();
    }
}
