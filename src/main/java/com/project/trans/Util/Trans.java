package com.project.trans.Util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Trans {
    public String trans(String sen){
        String line = null;
        String[] arguments = new String[] {"python", "G:\\untitled\\new\\venv\\Include\\翻译\\语料库_Google.py", sen};
        try {
            Process process = Runtime.getRuntime().exec(arguments);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = in.readLine()) != null) {
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
                return line;
            }
            in.close();
            int re = process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String arg[]){
        Trans t = new Trans();
        System.out.println(t.transEng("hello"));
//        try {
//            byte[] utf8Bytes = t.transEng("hello").getBytes("GBK");
//            String utf8Str = new String(utf8Bytes, "GBK");
//            System.out.println(utf8Str);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
    }
}
