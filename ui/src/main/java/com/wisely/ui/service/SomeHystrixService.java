package com.wisely.ui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class SomeHystrixService {

	@Autowired
	RestTemplate restTemplate; //1 todo Ribbon使用

	@HystrixCommand(fallbackMethod = "fallbackSome") //2 失败就用fallbackSome
	public String getSome() {
		//访问some的服务
		//return restTemplate.getForObject("http://some/getsome", String.class);
		return "aaa";
	}
	
	public String fallbackSome(){ 
		return "some service模块故障";
	}
}
