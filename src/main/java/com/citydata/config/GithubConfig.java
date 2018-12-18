package com.citydata.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author yjgithub
 * @Date 2018/5/29
 * @Description  测试配置文件信息
 */
@Component
public class GithubConfig {

    // name
    public static String name;
    @Value("${github.name}")
    public void setName(String $name) {
        this.name = $name;
    }

}
