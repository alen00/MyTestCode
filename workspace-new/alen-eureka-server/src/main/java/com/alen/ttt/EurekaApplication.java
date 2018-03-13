package com.alen.ttt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * <p>Title:EurekaApplication</p>
 * @author alen
 * @2018年3月13日 上午9:25:06
 *
 */
@EnableEurekaServer  //启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class EurekaApplication {

	public static void main(String[] args) {
		System.out.println("********************************eureka注册中心  启动了  ");
		SpringApplication.run(EurekaApplication.class, args);
	}
}
