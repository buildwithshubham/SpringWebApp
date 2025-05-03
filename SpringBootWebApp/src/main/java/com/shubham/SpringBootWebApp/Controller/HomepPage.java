package com.shubham.SpringBootWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
public class HomepPage {
	
	@RequestMapping("/")
	public String greet() {
		return "welocome to my page";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "abput section";
	}

}
