package com.KakaoBookApi.dto;

public class Meta {
    private Integer totalCount;
    private Integer pageableCount;
    private Boolean isEnd;
    
    
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getPageableCount() {
		return pageableCount;
	}
	public void setPageableCount(Integer pageableCount) {
		this.pageableCount = pageableCount;
	}
	public Boolean getIsEnd() {
		return isEnd;
	}
	public void setIsEnd(Boolean isEnd) {
		this.isEnd = isEnd;
	}

    
    

}
