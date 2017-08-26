package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.properties.ItcastProperties;

//该组合注解相当于@Controller 和  @ResponseBody
@Controller
@ResponseBody
@RequestMapping("/fm")
public class HelloWorldController {
	@Autowired
	private Environment environment;
	
	
	@Value("${cn.itcast.name}")
	private String itcastName;
	
	@Value("${cn.itcast.url}")
	private String itcastUrl;
	
	@Value("${com.itheima.name}")
	private String itheimaName;
	
	
	@Autowired
	private ItcastProperties itcastProperties;
	
	@RequestMapping("/test")
	public String sayHello() {
		System.out.println("方式一：");
		System.out.println("a-name=" + environment.getProperty("cn.itcast.name"));
		System.out.println("b-url=" + environment.getProperty("cn.itcast.url"));
		System.out.println("itheima-name=" + environment.getProperty("com.itheima.name"));
	
		System.out.println("----------------------------");
		System.out.println("方式二：");
		System.out.println("a-name=" + itcastName);
		System.out.println("b-url=" + itcastUrl);
		System.out.println("itheima-name=" + itheimaName);
		
		System.out.println("----------------------------");
		System.out.println("方式三：");
		System.out.println("a-name" + itcastProperties.getName());
		System.out.println("b-url" + itcastProperties.getUrl());
		
		return "Hello Wolrd!";
	}
}
