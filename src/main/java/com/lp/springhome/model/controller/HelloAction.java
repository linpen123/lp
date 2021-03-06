package com.lp.springhome.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HelloAction {
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        System.out.println(date);
//        张钰 是个肥嘟嘟的胖兔子
        return "zhangyufeituzi:"+format;
    }
}
