package com.ms.eui.config.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String homePage(Map<String, Object> model) {
		
		return "home";
	}
	@RequestMapping("/taskAssign")
	public String taskAssign(Map<String, Object> model) {
		
		return "taskAssign";
	}
	
	@RequestMapping("/welcome")
	public String welcome(Map<String, Object> model) {
		
		return "welcome";
	}

}