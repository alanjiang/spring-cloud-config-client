package com.study.springcloud.config.client;

import org.springframework.context.annotation.Configuration;


public class Config {
   private String pwd;

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}
   
}
