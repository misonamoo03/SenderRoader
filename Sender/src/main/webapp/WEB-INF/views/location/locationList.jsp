<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.misonamoo.smileway.domain.UserVO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>센더스</title>
	<link rel="stylesheet" href="/resources/css/reset.css">
	<link rel="stylesheet" href="/resources/css/style.css">
<script>
$(function(){
    $("#locationInsertBtn").click(function(){
    	var regExp1 = /\s/g;//공백 체크
    	var regExp = /^01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})$/; //휴대폰번호 체크
    	if ( $('#locationName').val().replace(/\s/g,"").length == 0 ) {
  	      alert("장소명 입력해주세요.");
  	      return false
  		}
  		if ( $('#charher').val().replace(/\s/g,"").length == 0 ) {
  	      alert("담당자를 입력해주세요.");
  	      return false
  		}
  		if ( $('#locationCellphone').val().replace(/\s/g,"").length == 0 ) {
  	      alert("연락처를 입력해주세요.");
  	      return false
	  	}
	  	if ( $('#locationPhone').val().replace(/\s/g,"").length == 0 ) {
  	      alert("전화번호를 입력해주세요.");
  	      return false
 	 	}
	  	if ( !regExp.test( $("#locationPhone").val() ) ) {
  	      alert("잘못된 휴대폰 번호입니다. 숫자, - 를 포함한 숫자만 입력하세요.");
  	      return false
  		}
 		if ( $('#locationPost').val().replace(/\s/g,"").length == 0 ) {
  	      alert("우편번호를 입력해주세요.");
  	      return false
 	 	}
 	 	if ( $('#locationAddress1').val().replace(/\s/g,"").length == 0 ) {
  	      alert("주소를 입력해주세요.");
  	      return false
  		}
 	 	if ( $('#locationAddress2').val().replace(/\s/g,"").length == 0 ) {
  	      alert("상세주소를 입력해주세요.");
  	      return false
  		}
    });
    

	
	 	$('#popupBtn').click(function(){
	       window.open("/locationPopup", "팝업명", "width=550, height=500, left=600, top=100");
	     });
});
</script>
</head>

<body>
	 <header class="header">
    <div>
        <h1>
            <span class="font-color-orange">가는길에</span> @센더스
        </h1>
        <form>
         <c:if test="${User == null }">
            <nav>
               <ul>
                  <li><a href="/loginform">로그인</a></li>
                  <li><a href="/signup">회원가입</a></li>
               </ul>
            </nav>
         </c:if>	
		<c:if test="${User != null }">
            <nav>
          <a href="/read?SUSER_ID=${User.SUSER_ID}">${User.SUSER_ID}님 안녕하세요</a>  | <input type="submit" formaction="logout" formmethod="get" id="logoutBtn" value="로그아웃">
            </nav>
      </div>
    <style>
    	.main-sub-menu>ul {
    		height: 50px;
    		display: flex;
    		justify-content: center;
    		align-items: center;
    	}
    	.main-sub-menu>ul li {
    		margin-right: 30px;
    	}
    	.main-sub-menu>ul li:last-child {
    		margin-right: 0;
    	}
    </style>
       	 <nav class="main-sub-menu">
            <ul>
                <li>상품관리</li>
                <li>배송관리</li>
                <li>회원정보</li>
            </ul>
        </nav>
		</c:if>
          <c:if test="${msg == false}">
        	 <p style="color: red;">로그인 실패! 아이디와 비밀번호 확인해주세요.</p>
		</c:if>
      </form>
      
    </header>

	<main class="main">
		<section class="main-container">
			<aside class="aside">
				<ul>
					<li><a href="">전체배송</a></li>
					<li><a href="">배송중 상품</a></li>
					<li><a href="">패송완료 상품</a></li>
					<li><a href="">배송요청</a></li>
					<li><a href="">장소 관리</a></li>
				</ul>
			</aside>
			<div class="sub-main">
			<form>
			
			<button type="button" onclick="location.href='/locationinsert'">장소등록</button>
			<button type="button" name="popupBtn" id="popupBtn">팝업화면</button>
				<table border="1" style="width: 800px;">
			<tr>
				<td width="77">
					<p align="center">번호</p>
				</td>
				<td width="100">
					<p align="center">장소</p>
				</td>
				<td width="327">
					<p align="center">주소</p>
				</td>
				<td width="197">
					<p align="center">연락처</p>
				</td>
				<td width="155">
					<p align="center">관리</p>
				</td>
			</tr>

			<c:forEach items="${list}" var="locationVO">
				<tr>
					<td align="center">${locationVO.locationNumber}</td>
					<td align="center">${locationVO.locationName}</td>
					<td align="center">${locationVO.locationAddress1} ${locationVO.locationAddress2}</td>
					<td align="center">${locationVO.locationPhone}</td>
					<td><a href="locationUpdate?locationNumber=${locationVO.locationNumber}">수정</a>/<a href="remove?locationNumber=${locationVO.locationNumber}">삭제</a></td>
				</tr>
			</c:forEach>
		</table>
		</form>
		<div style="display: flex; justify-content: center;">
			<c:if test="${pageMaker.prev}">
			<a href="/locationList${pageMaker.makeQuery(pageMaker.startPage - 1) }">&laquo;</a>
		</c:if>
		<c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }"
			var="idx">
			<c:out value="${pageMaker.cri.page == idx?'':''}" />
			<a href="/locationList${pageMaker.makeQuery(idx)}">${idx}</a>
		</c:forEach>
		<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
			<a href="/locationList${pageMaker.makeQuery(pageMaker.endPage +1) }">
				&raquo; </a>
		</c:if>
		</div>
			
			</div>
			
	</main>


	<footer class="footer">
		<h1>(주) 미소나무</h1>
		<div class="company">
			<dl>
				<dt>사업자 등록번호:</dt>
				<dd>217-81-41971</dd>
			</dl>
			<dl>
				<dt>대표:</dt>
				<dd>손성택</dd>
			</dl>
			<dl>
				<dt>주소:</dt>
				<dd>경기도 남양주시 덕송2로 70-9 504호</dd>
			</dl>
			<dl>
				<dt>대표번호:</dt>
				<dd>02) 6232-7000</dd>
			</dl>
			<dl>
				<dt>fax:</dt>
				<dd>02) 6232-7700</dd>
			</dl>
		</div>
		ⓒ Misonamoo Corp
	</footer>
	<script>
	
	</script>
	
</body>
</html>