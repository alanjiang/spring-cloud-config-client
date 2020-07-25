package com.study.springcloud.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private Config config;
	
	@RequestMapping("/hello")
    public String home() {
		System.out.println("=>url:"+config.getPwd());
        return "Hello World!";
    }
}
