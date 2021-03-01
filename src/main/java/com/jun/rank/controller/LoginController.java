package com.jun.rank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jun.rank.vo.UserVo;

@Controller
public class LoginController {
 @PostMapping({"/login"})
	public String login(UserVo vo) {
		System.out.println("login 데이터 전송"+vo);	
		// 자바 웹토큰 호출처리!!!		
		return "main/index"; 
	}
	

}
