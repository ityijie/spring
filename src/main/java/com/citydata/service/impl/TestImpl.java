package com.citydata.service.impl;
import com.citydata.bean.GithubBean;
import com.citydata.config.GithubConfig;
import com.citydata.constant.ResponseCode;
import com.citydata.response.ReturnData;
import com.citydata.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yjgithub on 2018/5/28.
 */
@Service
public class TestImpl implements TestService {
    @Override
    public ReturnData test(String str) {
        ReturnData rd = new ReturnData(ResponseCode.OPERATION_SUCCESS.getStatus(),ResponseCode.OPERATION_SUCCESS.getMsg(),str);
        return rd;
    }

    @Override
    public ReturnData exception() {
        int[] arr = {1,2,3};//元素只有3个
        System.out.println(arr[4]); //明显的数据越界异常
        ReturnData rd = new ReturnData(ResponseCode.OPERATION_SUCCESS.getStatus(),ResponseCode.OPERATION_SUCCESS.getMsg());
        return rd;
    }

    @Override
    public ReturnData getSingleValue() {
        String name = GithubConfig.name;
        ReturnData rd = new ReturnData(ResponseCode.OPERATION_SUCCESS.getStatus(),ResponseCode.OPERATION_SUCCESS.getMsg(),"获取单一属性name："+name);
        return rd;
    }


    @Autowired
    private GithubBean githubBean;
    @Override
    public ReturnData getBeanValue() {
        String allInfo = githubBean.toString();
        ReturnData rd = new ReturnData(ResponseCode.OPERATION_SUCCESS.getStatus(),ResponseCode.OPERATION_SUCCESS.getMsg(),"获取全部属性："+allInfo);
        return rd;
    }


}
