package com.study.springcloud.config.client;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;



@Configuration
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		
	}

	@Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
        c.setIgnoreUnresolvablePlaceholders(true);
        return c;
	}
	@Value("${test.password}")
	private String pwd;
	@Bean
	public Config Config() {
		
		Config cf = new Config();
		cf.setPwd(pwd);
		return cf;
	}

	
	}
