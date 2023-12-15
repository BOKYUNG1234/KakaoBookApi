package com.KakaoBookApi.dto;

import java.util.Date;
import java.util.List;

public class Document {

    private String title;         // 도서 제목
    private String contents;      // 도서 소개
    private String url;           // 도서 상세 URL
    private String isbn;          // ISBN
    private Date datetime;        // 도서 출판날짜
    private List<String> authors; // 도서 저자 리스트
    private String publisher;     // 도서 출판사
    private List<String> translators; // 도서 번역자 리스트
    private Integer price;        // 도서 정가
    private Integer sale_price;   // 도서 판매가
    private String thumbnail;     // 도서 표지 미리보기 URL
    private String status;        // 도서 판매 상태 정보
    
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public List<String> getTranslators() {
		return translators;
	}
	public void setTranslators(List<String> translators) {
		this.translators = translators;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getSale_price() {
		return sale_price;
	}
	public void setSale_price(Integer sale_price) {
		this.sale_price = sale_price;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

   

}
