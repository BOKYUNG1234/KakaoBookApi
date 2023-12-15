<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
      <script src="https://code.jquery.com/jquery-3.7.1.slim.min.js" integrity="sha256-kmHvs0B+OpCW5GVHUNjv9rOmY0IvSIRcf7zGUDTDQM8=" crossorigin="anonymous"></script>
      <title>다음 API를 활용한 책 검색</title>
      
      <link rel="shortcut icon" href="/resources/image/icon.png" />
      <link rel="apple-touch-icon" href="resources/image/icon.png" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
      <!--[if lt IE 9]>
      <script src="../js/html5shiv.js"></script>
      <![endif]-->
      <style>
      	body {
      		width : 60vw;
      		margin : 0 auto;
      		padding-top : 50px;
      		padding-bottom : 50px;
      	}
      	
      	@media screen and (max-width: 700px) {
		  /* 화면 너비가 768px 이하인 경우에만 적용되는 스타일 */
		  body {
		    width : 100%;
		    padding-top : 50px;
      		padding-bottom : 50px;
		  }
		}
      </style>
      
      <script>
      $(function(){
    	  
    	  
    	  	$('.bookTitle').click(function(event) {
    	      event.preventDefault(); // 기본 이벤트를 방지합니다 (링크 클릭시 페이지 이동 방지)
    	      var contents = $(this).data('contents'); // 클릭된 요소의 data-title 속성 값 가져오기
    	      
    	      alert(contents);
    	      
    	    });
    	  
    	  
      })
      
      </script>
    
   </head>
   <body>
   
   	<h3>다음 책 검색 API</h3>
   
	<form id="submitForm" method="GET" action="/test/search"> 
		<div class="input-group mb-3">
		  <input type="text" id="keywordInput" name="keyword" class="form-control" placeholder="키워드를 입력하세요" aria-label="Recipient's username" aria-describedby="button-addon2">
		  <button class="btn btn-outline-secondary" type="submit" id="button-addon2">도서검색</button>
		</div>
	</form>
	<table class="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">제목</th>
            <th scope="col">저자</th>
            <th scope="col">이미지</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach items="${result.documents}" var="document" varStatus="status">
            <tr>
              <th scope="row">${status.index + 1}</th>
              <td>
				  <a href="#" class="bookTitle" data-contents="${document.contents}">${document.title}</a>
			  </td>
              <td><c:forEach items="${document.authors}" var="author">${author} </c:forEach></td>
             
              <td><img src="${document.thumbnail}" alt="${document.title}" class="img-thumbnail" /></td>
            </tr>
           <!-- 제목 버튼을 누르면 여기 tr을 하나 더 만들어서 컨텐츠를 표시 -->
          </c:forEach>
          
        </tbody>
      </table>
      
      
     
   
   
   
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
   </body>
    
</html>