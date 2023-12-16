package com.KakaoBookApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.KakaoBookApi.Service.ApiService;
import com.KakaoBookApi.dto.Response;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/test")
@Slf4j
public class ApiController {
	//requestMapping을 주니까 되네??!!
	
	@Autowired
	private ApiService apiService;
	
	@GetMapping("/main")
	public String main() {
		log.info("====================== main 컨트롤러 실행 ======================");
	
		
		return "test/hihi";
	}
	
	@GetMapping("/search")
	public String searchBooks(@RequestParam("keyword") String keyword, Model model) {
		log.info("====================== searchBooks 컨트롤러 실행 ======================");
		log.info("키워드 : " + keyword);
		
		Response result = apiService.searchBooks(keyword);
		model.addAttribute("result", result);
		
		
		
		
		
		
		return "test/hihi";
	}
	
	
	
	
	
}
