package com.example.demo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.aliyun.openservices.shade.org.apache.commons.lang3.StringEscapeUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class ScData {
    public String scdata;
    public String autname;
    public String sctit;
    public static String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void searchScdata(String path,String tit,String name){

        String s = readJsonFile(path);

        JSONObject jobj =JSONObject.parseObject(s);
        JSONArray links = jobj.getJSONArray(name);
        for (int i = 0 ; i < links.size();i++){
            JSONObject key = (JSONObject)links.get(i);;
            String par = JSON.toJSONString(key.get("paragraphs"));
            if(JSON.toJSONString(key.get("title")).contains(tit)){
                scdata+=par;
            }
        }
    }
    public void setScdata(String path,String name){
        String s = readJsonFile(path);

        JSONObject jobj =JSONObject.parseObject(s);
        JSONArray links = jobj.getJSONArray(name);
        for (int i = 0 ; i < links.size();i++){
            JSONObject key = (JSONObject)links.get(i);;
            String par = JSON.toJSONString(key.get("paragraphs"));
            scdata+=par;
            String tit = JSON.toJSONString(key.get("title"));
            sctit+=tit;
        }
    }
    public void setScdataci(String path,String name){
        String s = readJsonFile(path);

        JSONObject jobj =JSONObject.parseObject(s);
        JSONArray links = jobj.getJSONArray(name);
        for (int i = 0 ; i < links.size();i++){
            JSONObject key = (JSONObject)links.get(i);;
            String par = JSON.toJSONString(key.get("paragraphs"));
            scdata+=par;
            String tit = JSON.toJSONString(key.get("rhythmic"));
            sctit+=tit;
            String aut= JSON.toJSONString(key.get("author"));
            autname+=aut;
        }
    }
    public void setScdatasongshi(String path,String name){
        String s = readJsonFile(path);
        JSONObject jobj =JSONObject.parseObject(s);
        JSONArray links = jobj.getJSONArray(name);
        for (int i = 0 ; i < links.size();i++){
            JSONObject key = (JSONObject)links.get(i);;
            String par = JSON.toJSONString(key.get("paragraphs"));
            scdata+=par;
            String tit = JSON.toJSONString(key.get("title"));
            sctit+=tit;
            String aut= JSON.toJSONString(key.get("author"));
            autname+=aut;
        }
    }
    public void setlunyu(String path,String name){
        String s = readJsonFile(path);
        JSONObject jobj =JSONObject.parseObject(s);
        JSONArray links = jobj.getJSONArray(name);
        for (int i = 0 ; i < links.size();i++){
            JSONObject key = (JSONObject)links.get(i);;
            String par = JSON.toJSONString(key.get("paragraphs"));
            scdata+=par;
            String tit = JSON.toJSONString(key.get("chapter"));
            sctit+=tit;
        }
    }
    public void setshijing(String path,String name){
        String s = readJsonFile(path);
        JSONObject jobj =JSONObject.parseObject(s);
        JSONArray links = jobj.getJSONArray(name);
        for (int i = 0 ; i < links.size();i++){
            JSONObject key = (JSONObject)links.get(i);;
            String par = JSON.toJSONString(key.get("content"));
            scdata+=par;
            String tit = JSON.toJSONString(key.get("title"));
            sctit+=tit+"-"+JSON.toJSONString(key.get("chapter"))+"-"+JSON.toJSONString(key.get("section"));
        }
    }
}
