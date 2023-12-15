package com.KakaoBookApi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.KakaoBookApi.dto.Response;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ApiService {

    private final RestTemplate restTemplate;
    private final String API_KEY = "f6fe47d57923b395597b0530446462ac";

    @Autowired
    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    
    
    public Response searchBooks(String query) {
    	System.out.println(" ======================== searchBooks ========================");
    	log.info("들어온 키워드 : "+ query);
    	
        String baseUrl = "https://dapi.kakao.com/v3/search/book";
        
        // 파라미터 설정
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl)
            .queryParam("target", "title")
            .queryParam("query", query);
        
        log.info("최종 url 값 : " + builder.toUriString());
        // httpHeaders 객체 생성 후 헤더에 api키 설정
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "KakaoAK " + API_KEY);

        // 헤더만 설정하고 요청 본문을 반환받지는 않으므로 void로 설정해도 되지만 관례상 String을 썼음
        HttpEntity<String> entity = new HttpEntity<>(headers);
        
        // API에서 응답해주는 데이터가 JSON 형식이라 DTO를 만들어 매핑
        ResponseEntity<Response> response = restTemplate.exchange(
           // builder.toUriString(), 
        		// 인코딩이 두번되어서 한글 검색이 안되는 거였음, 두개의 차이점이 뭐지?
        	builder.build().encode().toUri(),
            HttpMethod.GET, 
            entity, 
            Response.class
        );
        
        
        
       

        // 응답받은 JSON 데이터 response에 매핑해 리턴
        return response.getBody();
    }
    
	
}
