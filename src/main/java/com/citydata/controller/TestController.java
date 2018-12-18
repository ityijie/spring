package com.citydata.controller;

import com.citydata.constant.ResponseCode;
import com.citydata.response.ReturnData;
import com.citydata.service.impl.TestImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yjgithub on 2018/5/28.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    TestImpl testService;

    @RequestMapping("/index")
    public ReturnData index(String Str) {
        return testService.test(Str);
    }

    @RequestMapping("/exception")
    public ReturnData exception() {
        return testService.exception();
    }

    @RequestMapping("/singleValue")
    public ReturnData singleValue() {
        return testService.getSingleValue();
    }

    @RequestMapping("/beanValue")
    public ReturnData beanValue() {
        return testService.getBeanValue();
    }

}
