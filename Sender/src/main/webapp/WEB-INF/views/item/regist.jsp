<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.misonamoo.smileway.domain.UserVO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <meta charset="UTF-8">
    <title>센더스</title>
    <link rel="stylesheet" href="/resources/css/reset.css">
    <link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
    <header class="header">
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
					${User.SUSER_ID}님 안녕하세요 | <input type="submit" formaction="logout" formmethod="get" id="logoutBtn" value="로그아웃">
				</nav>
			</c:if>
		</form>
    </header>    

    <main class="main">
        <nav class="sub-menu">
            <ul>
                <li>상품관리</li>
                <li>배송관리</li>
                <li>회원정보</li>
            </ul>
        </nav>
        <section class="main-container">
            <aside class="aside">
                <ul>
                    <li><a href="/item/catagory">상품카테고리</a></li>
					<li><a href="/item/itemList">상품목록</a></li>
					<li><a href="/item/regist">상품등록</a></li>
                </ul>
            </aside>
            <div class="sub-main">

                <section class="reg-item">
                    <h1>상품정보</h1>
                     <form role="form" method="post" enctype="multipart/form-data">
                    <table>
                        <tbody>
                            
                            <tr>
                                <td>상품명</td>
                                <td>
                                    <input type="text" id="ITEM_NAME" name="ITEM_NAME"> 
                                </td>
                            </tr>
                            <tr>
                                <td>카테고리</td>
                                <td>
                                    <select name="CATAGORY_ID" class="catagory">
                                        <option value="">선택</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td>상품구분</td>
                                <td>
                                    <select name="ITEM_TYPE">
                                        <option value="">선택</option>
                                            <option value="공산품">공산품</option>
                                            <option value="신선식품">신선식품</option>
                                            <option value="냉동식품">냉동식품</option>
                                            <option value="화훼상품">화훼상품</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td>상품가격</td>
                                <td>
                                    <input type="text" id="ITEM_PRICE" name="ITEM_PRICE"> 원
                                </td>
                            </tr>
                          <tr>
                                <td>가로+세로+높이</td>
                                <td>
                                   	가로: <input type="text" id="ITEM_WIDTH" name="ITEM_WIDTH">
                                   	세로: <input type="text" id="ITEM_LENGTH" name="ITEM_LENGTH">
                                   	높이: <input type="text" id="ITEM_HEIGHT" name="ITEM_HEIGHT">
                                </td>
                            </tr>
                             <tr>
                                <td>무게</td>
                                <td>
                                    <select name="ITEM_WEIGHT">
                                        <option value="">선택</option>
                                        <option value="1">1kg 이내</option>
                                        <option value="2">2kg 이내</option>
                                        <option value="3">3kg 이내</option>
                                        <option value="4">5kg 이내</option>
                                        <option value="5">7kg 이내</option>
                                        <option value="6">10kg 이내</option>
                                        <option value="7">10kg 초과</option>
                                    </select>
                                </td>
                            </tr>
                              
                            <tr>
                                <td>이미지</td>
                                <td>
                                    <input type="file" id="ITEM_PICTURE" name="file" />
                                    <div class="select_img"><img src=""/></div>
                                     <%=request.getRealPath("/") %>
                                </td>
                            </tr>
                           
                            <tr>
                            
                                <td>제품설명</td>
                                <td>
                                    <textarea id="ITEM_EXPLAIN" name="ITEM_EXPLAIN"></textarea>
                                </td>
                            </tr>
                            <tr>
                                <td>주의사항</td>
                                <td class="text-col">
                                    <textarea id="ITEM_WARN" name="ITEM_WARN"></textarea>
                                </td>
                            </tr>
                            <tr>
                             <td><button type="submit" id="register_Btn">등록</button></td>
                            </tr>
                           
                        </tbody>
                    </table>
                    </form>
                </section>

            </div>
        </section>
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
		//컨트롤러에서 데이터 받기
		var jsonData = JSON.parse('${catagoryList}');
		console.log(jsonData);

		var cateArr = new Array();
		var cateObj = new Object();

		//셀렉트 박스에 삽입할 데이터 준비
		for(var i = 0; i < jsonData.length; i++) {
 
  		cateObj = new Object();  //초기화
  		cateObj.CATAGORY_ID = jsonData[i].CATAGORY_ID;
  		cateObj.CATAGORY_NAME = jsonData[i].CATAGORY_NAME;
  		cateArr.push(cateObj);
		}

		//1차 분류 셀렉트 박스에 데이터 삽입
		var cateSelect = $("select.catagory")

		for(var i = 0; i < cateArr.length; i++) {
			cateSelect.append("<option value='" + cateArr[i].CATAGORY_ID + "'>"
				      + cateArr[i].CATAGORY_NAME + "</option>");  
		}
		
		//이미지 첨부
		$("#ITEM_PICTURE").change(function(){
  			 if(this.files && this.files[0]) {
    				var reader = new FileReader;
    				reader.onload = function(data) {
     				$(".select_img img").attr("src", data.target.result).width(500);        
    				}
    		reader.readAsDataURL(this.files[0]);
   				}
 		 });
		
	</script>
</body>
</html>