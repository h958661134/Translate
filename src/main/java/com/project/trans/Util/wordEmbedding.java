package com.project.trans.Util;

import com.baidu.aip.nlp.AipNlp;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Iterator;

public class wordEmbedding {
    //设置APPID/AK/SK
    public static final String APP_ID = "14494753";
    public static final String API_KEY = "7ANhhaOxKwfH4opIKa1bEbj1";
    public static final String SECRET_KEY = "yx1D7tUmul8Gx5CU4kglPTqqUMmzBgz4";

    /**
     * 词向量（Word embedding），又叫Word嵌入式自然语言处理（NLP）中的一组语言建模和特征学习技术的统称，其中来自词汇表的单词或短语被映射到实数的向量。 从概念上讲，它涉及从每个单词一维的空间到具有更低维度的连续向量空间的数学嵌入。
     * 生成这种映射的方法包括神经网络，单词共生矩阵的降维，概率模型，可解释的知识库方法，和术语的显式表示 单词出现的背景。
     * 当用作底层输入表示时，单词和短语嵌入已经被证明可以提高NLP任务的性能，例如语法分析和情感分析。
     * @param word
     */
    public String wordEmbedding(String word) {
        // 初始化一个AipNlp
        AipNlp client = new AipNlp(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 传入可选参数调用接口
        HashMap<String, Object> options = new HashMap<String, Object>();

        // 词向量表示
        JSONObject res = client.wordEmbedding(word, options);
        System.out.println(res.toString(2));

        Iterator iterator = res.keys();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            System.out.println(key);
        }
        JSONArray arr1=res.getJSONArray("vec");

        return arr1.toString();
    }
}
