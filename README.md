### 책 검색 사이트

#### 카카오 도서 검색 API를 활용한 도서 검색 사이트

#### 사용기술
JAVA 17, SpringBoot3, STS4, Git, Kakao Book API, BootStrap, jQuery   
JSP, RestTemplate

---
1. 검색 화면   
<img width="726" alt="image" src="https://github.com/mipoung/kakaoBookApi/assets/95519464/68a40f46-f103-46f3-a1f0-95801348dc59">  <br> 
검색 화면에서 검색하고싶은 도서 키워드를 입력해 도서를 검색할 수 있습니다.   
키워드가 없을 경우 검색어를 입력하라는 문구를 출력하도록 하였습니다. (JSTL c:if 문법 활용)   

---

2. 도서 검색   
<img width="730" alt="image" src="https://github.com/mipoung/kakaoBookApi/assets/95519464/4844d47c-07c8-455b-be47-c04ccf061f8d">   <br>
키워드를 입력해 도서를 검색하면 하단 테이블에 검색 결과를 표시합니다.   
제목, 저자, 출판사, 출판일, 도서 썸네일 등을 표시합니다.   

---

2-1. 유효성 검사   
<img width="760" alt="image" src="https://github.com/mipoung/kakaoBookApi/assets/95519464/c5948927-ba8f-4d7f-a196-c89b9e0815f5">   <br>
검색어를 입력하지 않았거나 공백을 입력했을 경우 검색어를 입력해달라는 알림창을 띄웁니다.   

---

3. 도서 설명 보기   
<img width="675" alt="image" src="https://github.com/mipoung/kakaoBookApi/assets/95519464/ecda6473-eb30-42c7-93ab-fab625ba0715">   <br>
검색 결과에서 도서 제목을 클릭하면 도서에 대한 간략한 설명을 하단에 동적으로 생성해 표시합니다.   
더 자세한 정보가 필요할 경우 오른쪽 하단 ...더보기 를 클릭해 다음 책 검색페이지로 이동합니다.   
만약 다른 도서의 제목을 클릭하면 열려있는 하단 설명을 제거하고 클릭된 도서의 하단 설명을 생성합니다.   

---

4. 맨 위로   
<img width="731" alt="image" src="https://github.com/mipoung/kakaoBookApi/assets/95519464/252430e2-9633-4ee4-8f4b-1f6634399368">   <br>
앵커태그를 이용해 하단에서 최상단으로 바로 이동할 수 있는 버튼을 제공합니다.


5. 반응형 웹으로 디자인
<img width="397" alt="image" src="https://github.com/mipoung/kakaoBookApi/assets/95519464/57734168-f2d0-4d9f-80a9-373225f66ce8"> <br>
미디어쿼리를 이용해 반응형 웹으로 디자인되어 모바일에서도 최적의 환경을 제공합니다.   


