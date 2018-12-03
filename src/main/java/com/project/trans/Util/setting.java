package com.project.trans.Util;

import com.baidu.aip.nlp.AipNlp;
import org.json.JSONObject;

public class setting {
    public static final String APP_ID = "14494753";
    public static final String API_KEY = "7ANhhaOxKwfH4opIKa1bEbj1";
    public static final String SECRET_KEY = "yx1D7tUmul8Gx5CU4kglPTqqUMmzBgz4";

    public AipNlp link(){
        AipNlp client = new AipNlp(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        return client;
    }
}
