package com.alen.ttt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class Test1Controller {

	@RequestMapping("/getOk")
	public String resUnzip(@RequestParam("param") String param) {
		System.out.println("***********test-getOk*******param=="+param);
		return param;
	}
}
