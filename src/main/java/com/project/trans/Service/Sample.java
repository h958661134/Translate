package com.project.trans.Service;
import com.baidu.aip.nlp.AipNlp;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;

public class Sample {

    /**
     * 词法分析  词法分析接口向用户提供分词、词性标注、专名识别三大功能；能够识别出文本串中的基本词汇（分词），对这些词汇进行重组、标注组合后词汇的词性，并进一步识别出命名实体。
     *
     * n	普通名词	f	方位名词	s	处所名词	t	时间名词
     * nr	人名	ns	地名	nt	机构团体名	nw	作品名
     * nz	其他专名	v	普通动词	vd	动副词	vn	名动词
     * a	形容词	ad	副形词	an	名形词	d	副词
     * m	数量词	q	量词	r	代词	p	介词
     * c	连词	u	助词	xc	其他虚词	w	标点符号
     * 未标注，专名
     *
     * @param text
     * @return
     */
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
            item.append(js.get("item")+"("+js.get("pos")+")"+"  ");
        }

        return item.toString();
    }
}
