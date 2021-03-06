<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@page import="com.misonamoo.smileway.domain.UserVO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>상품 목록 팝업</title>
<link rel="stylesheet" href="/resources/css/reset.css">
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>

   <main class="main">
      <section class="main-container">
         <div class="sub-main">
            <section class="reg-item">
            <ul>
            
                  <li>상품명  <input type="text" name='keyword' id="keywordInput" value='${cri.keyword}'>
                  <li>사용여부  <input type="radio" name="searchType" value="A" <c:out value="${cri.searchType == null?'checked':''}"/>> 전체 
                  <input type="radio" name="searchType" value="Y" <c:out value="${cri.searchType eq 'Y'?'checked':''}"/>> 사용 
                  <input type="radio" name="searchType" value="N" <c:out value="${cri.searchType eq 'N'?'checked':''}"/>> 미사용
                  <li><button id='searchBtn'>조회</button>
            </ul>
            <hr>
            <div style="text-align:right;">
            <button onclick="location.href='/item/regist'">상품등록</button>
            </div>
            <hr>
               <form role="form" method="post" enctype="multipart/form-data">
                  <table>
                     <tbody>
                        <tr>
                           <td>No</td>
                           <td>이미지</td>
                           <td>상품명</td>
                           <td>카테고리명</td>
                           <td>사용여부</td>
                           <td>가격</td>
                           <td>보내기 횟수</td>
                           <td>등록일</td>
                           <td>관리</td>
                        </tr>

                        <c:forEach items="${list}" var="list">
                           <tr>
                              <td>${list.ITEM_NO}</td>
                              <td><img style="width: 120px;"
                                 src="${list.ITEM_PICTURE_Thum}"></td>
                              <td>${list.ITEM_NAME}</td>
                              <td>${list.CATAGORY_NAME}</td>
                              <td>${list.ITEM_USEAGE}</td>
                              <td>${list.ITEM_PRICE}</td>
                              <td>${list.ITEM_DEL_COUNT}</td>
                              <td>${list.ITEM_REG_DATE}</td>
                              <td><a href="/item/itemRead?ITEM_NO=${list.ITEM_NO}">수정</a>|<a href="/item/delete?ITEM_NO=${list.ITEM_NO}">삭제</a></td>
                           </tr>
                        </c:forEach>

                     </tbody>
                  </table>
               </form>
               <div style="text-align:center;" >
                  <ul style="display:flex; justify-content:center">
                  

                     <c:if test="${pageMaker.prev}">
                        <li>
                         <a href="/item/itemList${pageMaker.makeSearch(pageMaker.startPage - 1)}">&laquo;</a>
                        </li>
                     </c:if>

                     <c:forEach begin="${pageMaker.startPage }"
                        end="${pageMaker.endPage }" var="idx">
                        <li
                           <c:out value="${pageMaker.cri.page == idx?'class =active':''}"/>>
                            <a href="/item/itemList${pageMaker.makeSearch(idx)}">[${idx}]</a>
                        </li>
                     </c:forEach>

                     <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
                        <li>
                         <a href="/item/itemList${pageMaker.makeSearch(pageMaker.endPage + 1)}">&raquo;</a>
                        </li>
                     </c:if>
                  </ul>
               </div>
            </section>
         </div>
      </section>
   </main>
   <script type="text/javascript">
   $(document).ready(
         function() {
            $('#searchBtn').on(
                  "click",
                  function(event) {
                     self.location = "itemList"
                           + '${pageMaker.makeQuery(1)}'
                           + "&searchType="
                           + $('input[name=searchType]:checked').val()
                           + "&keyword=" + $('#keywordInput').val();
                  });
         });
   </script>
</body>
</html>