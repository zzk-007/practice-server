package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserContoroller {
    private UserRepository userRepository;
    @RequestMapping("/zhuce")
    public  ApiResult zhuce() {
        UserDao userDao=new UserDao();
        userDao.setUserName("clf");
        userRepository.save(userDao);
        int code = 0;
        String status = "unknown error";
        List<UserDao> data = null;
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(code);
        apiResult.setStatus(status );
        apiResult.setData(data);//需要返回的信息
        return apiResult;
    }
    @RequestMapping("/logon")
    public  ApiResult logon() {
        int code = 0;
        String status = "unknown error";
        List<UserDao> data = null;
        try {
            data=userRepository.findByUserName("clf");
            code=300;
        }catch (Exception e){
            status=String.valueOf(e);
        }
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(code);
        apiResult.setStatus(status );
        apiResult.setData(data);//需要返回的信息
        return apiResult;
    }
    @RequestMapping("/search")
    public  ApiResult searchSc() {
        ApiResult apiResult = new ApiResult();
        ScData scData1 = new ScData();
        scData1.searchScdata("chinese-poetry/caocaoshiji/caocao.json","度关山","caocaoshiji");
        apiResult.setCode(300);//成功的代码
        apiResult.setStatus("Success");//状态
        apiResult.setData(scData1.scdata);//需要返回的信息
        return apiResult;
    }
    @RequestMapping("/caocaoshiji")
    public  ApiResult caocaoshiji() {
        ApiResult apiResult = new ApiResult();
        ScData scData1 = new ScData();
        scData1.setScdata("chinese-poetry/caocaoshiji/caocao.json","caocaoshiji");
        apiResult.setCode(300);//成功的代码
        apiResult.setStatus("Success");//状态
        apiResult.setData(scData1.scdata);//需要返回的信息
        apiResult.setTit(scData1.sctit);
        return apiResult;
    }
    @RequestMapping("/songci")
    public  ApiResult songci() {
        ApiResult apiResult = new ApiResult();
        ScData scData1 = new ScData();
        for(int i=1;i<2;i++){
            scData1.setScdataci("chinese-poetry/ci/ci.song."+i+"000.json","songci"+i);
        }
        scData1.setScdataci("chinese-poetry/ci/ci.song.0.json","songci0");
        scData1.setScdataci("chinese-poetry/ci/ci.song.2019y.json","songci2019");
        apiResult.setCode(300);//成功的代码
        apiResult.setStatus("Success");//状态
        apiResult.setData(scData1.scdata);//需要返回的信息
        apiResult.setTit(scData1.sctit);
        apiResult.setAut(scData1.autname);
        return apiResult;
    }
    @RequestMapping("/songshi")
    public  ApiResult songshi() {
        ApiResult apiResult = new ApiResult();
        ScData scData1 = new ScData();
        for(int i=1;i<1;i++){
            scData1.setScdataci("chinese-poetry/json/poet.song."+i+"000.json","songshi"+i);
        }
        scData1.setScdatasongshi("chinese-poetry/json/poet.song.0.json","songshi0");
        apiResult.setCode(300);//成功的代码
        apiResult.setStatus("Success");//状态
        apiResult.setData(scData1.scdata);//需要返回的信息
        apiResult.setTit(scData1.sctit);
        apiResult.setAut(scData1.autname);
        return apiResult;
    }
    @RequestMapping("/tangshi")
    public  ApiResult tangshi() {
        ApiResult apiResult = new ApiResult();
        ScData scData1 = new ScData();
        for(int i=1;i<1;i++){
            scData1.setScdataci("chinese-poetry/json/poet.tang."+i+"000.json","tangshi"+i);
        }
        scData1.setScdatasongshi("chinese-poetry/json/poet.tang.0.json","tangshi0");
        apiResult.setCode(300);//成功的代码
        apiResult.setStatus("Success");//状态
        apiResult.setData(scData1.scdata);//需要返回的信息
        apiResult.setTit(scData1.sctit);
        apiResult.setAut(scData1.autname);
        return apiResult;
    }
    @RequestMapping("/lunyu")
    public  ApiResult lunyu() {
        ApiResult apiResult = new ApiResult();
        ScData scData1 = new ScData();
        scData1.setlunyu("chinese-poetry/lunyu/lunyu.json","lunyu");
        apiResult.setCode(300);//成功的代码
        apiResult.setStatus("Success");//状态
        apiResult.setData(scData1.scdata);//需要返回的信息
        apiResult.setTit(scData1.sctit);
        apiResult.setAut(scData1.autname);
        return apiResult;
    }
    @RequestMapping("/shijing")
    public  ApiResult shijing() {
        ApiResult apiResult = new ApiResult();
        ScData scData1 = new ScData();
        scData1.setshijing("chinese-poetry/shijing/shijing.json","shijing");
        apiResult.setCode(300);//成功的代码
        apiResult.setStatus("Success");//状态
        apiResult.setData(scData1.scdata);//需要返回的信息
        apiResult.setTit(scData1.sctit);
        apiResult.setAut(scData1.autname);
        return apiResult;
    }
}
