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
@RequestMapping("/bookApi")
@Slf4j
public class ApiController {
	//requestMapping을 주니까 되네??!!
	
	@Autowired
	private ApiService apiService;
	
	@GetMapping("/")
	public String main() {
		log.info("====================== main 컨트롤러 실행 ======================");
	
		
		return "bookApi/bookSearch";
	}
	
	@GetMapping("/search")
	public String searchBooks(@RequestParam(value = "keyword", required = false) String keyword, Model model) {
		log.info("====================== searchBooks 컨트롤러 실행 ======================");
		log.info("키워드 : " + keyword);
		
		 if (keyword == null || keyword.trim().isEmpty()) {
		        model.addAttribute("errorMessage", "검색어를 입력하세요.");
		        // 검색어가 없는 경우 메시지 설정
		    } else {
		        Response result = apiService.searchBooks(keyword);
		        model.addAttribute("result", result);
		    }
		
		
		
		return "bookApi/bookSearch";
	}
	
	
	
	
	
}
