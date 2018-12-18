package com.citydata.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by yjgithub on 2018/5/29.
 * name
 * email
 * sex
 */
@ConfigurationProperties(prefix="github")
public class GithubBean {
    private String name;
    private String email;
    private String sex;

    @Override
    public String toString() {
        return "yjgithub{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public GithubBean(String name, String email, String sex) {
        this.name = name;
        this.email = email;
        this.sex = sex;
    }

    public GithubBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
