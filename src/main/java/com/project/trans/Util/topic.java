package com.project.trans.Util;

import com.baidu.aip.nlp.AipNlp;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;

public class topic {
    public static final String APP_ID = "14494753";
    public static final String API_KEY = "7ANhhaOxKwfH4opIKa1bEbj1";
    public static final String SECRET_KEY = "yx1D7tUmul8Gx5CU4kglPTqqUMmzBgz4";

    /**
     * 文章分类
     *
     * @param title
     * @param content
     * @return
     */
    public String keyword(String title,String content) {
        // 初始化一个AipNlp
        AipNlp client = new AipNlp(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 传入可选参数调用接口
        HashMap<String, Object> options = new HashMap<String, Object>();

        // 文章分类
        JSONObject res = client.topic(title, content, options);


        JSONObject ar1=res.getJSONObject("item");
        JSONArray arr1 = ar1.getJSONArray("lv2_tag_list");
        StringBuffer item=new StringBuffer();
        item.append("一级分类\n");
        for (int i=0;i<arr1.length();i++){
            JSONObject js=arr1.getJSONObject(i);
            item.append(js.get("tag")+"("+js.get("score")+")"+"\n");
        }

        item.append("\n\n二级分类\n");
        JSONArray arr2 = ar1.getJSONArray("lv1_tag_list");
        for (int i=0;i<arr2.length();i++){
            JSONObject js=arr2.getJSONObject(i);
            item.append(js.get("tag")+"("+js.get("score")+")"+"\n");
        }

        return item.toString();
    }
}
