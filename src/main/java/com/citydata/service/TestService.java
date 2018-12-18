package com.citydata.service;

import com.citydata.response.ReturnData;

/**
 *
 * Created by yjgithub on 2018/5/28.
 */
public interface TestService {
    public ReturnData test(String str);
    public ReturnData exception();
    public ReturnData getSingleValue();
    public ReturnData getBeanValue();
}
