package com.jun.rank.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class MainController implements ErrorController {
	@GetMapping({"/"})
	public String index() {
		return "main/index"; 
	}
	
	
	
	
	
//	에러 시 경로 ~~~
	@Override
	public String getErrorPath() {
		System.out.println("error");
		return "/error";
	}
}
