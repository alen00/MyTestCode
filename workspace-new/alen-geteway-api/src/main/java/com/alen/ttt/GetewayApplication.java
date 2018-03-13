package com.alen.ttt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * geteway网关
 * <p>Title:GetewayApplication</p>
 * @author alen
 * @2018年3月13日 上午9:24:58
 *
 */
@EnableZuulProxy
@SpringBootApplication
public class GetewayApplication {

	public static void main(String[] args) {
		System.out.println("********************************geteway-网关  启动了  ");
		SpringApplication.run(GetewayApplication.class, args);
	}
}
