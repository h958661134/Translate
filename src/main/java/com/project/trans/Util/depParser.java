package com.project.trans.Util;

import com.baidu.aip.nlp.AipNlp;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;

public class depParser {
    public static final String APP_ID = "14494753";
    public static final String API_KEY = "7ANhhaOxKwfH4opIKa1bEbj1";
    public static final String SECRET_KEY = "yx1D7tUmul8Gx5CU4kglPTqqUMmzBgz4";

    /**
     * 依存句法分析
     *
     * 依存句法分析接口可自动分析文本中的依存句法结构信息，利用句子中词与词之间的依存关系来表示词语的句法结构信息（如“主谓”、“动宾”、“定中”等结构关系），并用树状结构来表示整句的结构（如“主谓宾”、“定状补”等）。
     *
     * Ag	形语素	g	语素	ns	地名	u	助词
     * a	形容词	h	前接成分	nt	机构团体	vg	动语素
     * ad	副形词	i	成语	nz	其他专名	v	动词
     * an	名形词	j	简称略语	o	拟声词	vd	副动词
     * b	区别词	k	后接成分	p	介词	vn	名动词
     * c	连词	l	习用语	q	量词	w	标点符号
     * dg	副语素	m	数词	r	代词	x	非语素字
     * d	副词	Ng	名语素	s	处所词	y	语气词
     * e	叹词	n	名词	tg	时语素	z	状态词
     * f	方位词	nr	人名	t	时间词	un	未知词
     *
     * @param text
     * @return
     */
    public String depParser(String text) {
        // 初始化一个AipNlp
        AipNlp client = new AipNlp(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 传入可选参数调用接口
        HashMap<String, Object> options = new HashMap<String, Object>();
        options.put("mode", 1);

        // 依存句法分析
        JSONObject res = client.depParser(text, options);

        Iterator iterator = res.keys();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            System.out.println(key);
        }
        JSONArray arr1=res.getJSONArray("items");
        StringBuffer item=new StringBuffer();
        for (int i=0;i<arr1.length();i++){
            JSONObject js=arr1.getJSONObject(i);
            item.append("id:"+js.get("id")+"  "+js.get("word")+"("+js.get("postag")+")"+"  "+"head:"+js.get("head")+"  "+"deprel:"+js.get("deprel")+"\n");
        }

        return item.toString();
    }
}
