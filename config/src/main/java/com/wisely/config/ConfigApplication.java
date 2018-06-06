package com.wisely.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer //1 mark 我是配置服务
@EnableEurekaClient //2 mark 在Eureka注册
public class ConfigApplication {
	
	 public static void main(String[] args) {
	        SpringApplication.run(ConfigApplication.class, args);
	    }

}
