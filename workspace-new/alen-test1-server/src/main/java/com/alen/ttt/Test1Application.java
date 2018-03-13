package com.alen.ttt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//springboot启动
@SpringBootApplication
//Eureka服务
@EnableEurekaClient
//声明式接口调用
@EnableFeignClients
@EnableWebMvc
//扫描该包路径下的所有spring组件
@ComponentScan(basePackages={"com.alen.ttt"})
public class Test1Application {
	
	/**
	 * 启动
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("********************************test1-服务启动了");
		SpringApplication.run(Test1Application.class, args);
	}

}
