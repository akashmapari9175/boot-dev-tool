package com.dev.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a= 10;
		int b= 20;
		int c= 30;
		int d = 40;
		return "this is just calculating sum is ading all -> "+(a+b+c+d);
	}
}
