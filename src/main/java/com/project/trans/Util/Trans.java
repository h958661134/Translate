package com.project.trans.Util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Scanner;

public class Trans {
    public String trans(String sen){
        String line = null;
        String[] arguments = new String[] {"python", "G:\\untitled\\new\\venv\\Include\\翻译\\语料库_Google.py", sen};
        try {
            Process process = Runtime.getRuntime().exec(arguments);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = in.readLine()) != null) {
//                return URLEncoder.encode(line,"utf-8");
                return line;
            }
            in.close();
            int re = process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String transEng(String sen){
        String line = null;
        String[] arguments = new String[] {"python", "G:\\untitled\\new\\venv\\Include\\翻译\\English.py", sen};
        try {
            Process process = Runtime.getRuntime().exec(arguments);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = in.readLine()) != null) {
                StringBuilder strBuilder = new StringBuilder(line);
                int a=strBuilder.indexOf("\\");
                while(a != -1)
                {
                    a=strBuilder.indexOf("\\");
                    if (a==-1){
                        break;
                    }
                    strBuilder.replace(a,a+2,"%");
                }
                a=strBuilder.indexOf("'");
                while(a != -1)
                {
                    a=strBuilder.indexOf("'");
                    if (a==-1){
                        break;
                    }
                    strBuilder.replace(a,a+1,"");
                }
                strBuilder.replace(0,1,"");
                line=strBuilder.toString();

                String str1=URLDecoder.decode(line.toUpperCase(), "UTF-8");
                return str1;
            }
            in.close();
            int re = process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String arg[]) throws UnsupportedEncodingException {
        Trans t = new Trans();
        String line=t.transEng("hello");
        System.out.println(line);

//        System.out.println(line.toUpperCase());
////解码
//        String str1=URLDecoder.decode(line, "UTF-8");
//        System.out.println(str1);
//        try {
//            byte[] utf8Bytes = t.transEng("hello").getBytes("GBK");
//            String utf8Str = new String(utf8Bytes, "GBK");
//            System.out.println(utf8Str);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
    }
}
