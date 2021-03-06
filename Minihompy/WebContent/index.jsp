<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	form { position: relative; overflow: hidden; }
	span.myactive { position: relative; width: 100px; height: 30px; border: 1px solid #DCDCDC; color: DimGray; background-color: #DCDCDC; display: block; z-index: 2; line-height: 30px; font-size: 13px; text-align: center; box-sizing: border-box; transform: translateX(0) translateY(-30px); transition: 1s; border-radius: 5px; }
	span { position: relative; width: 100px; height: 30px; border: 1px solid #DCDCDC; color: DimGray; background-color: #DCDCDC; display: block; z-index: 2; line-height: 30px; font-size: 13px; text-align: center; box-sizing: border-box; border-radius: 5px; transform: translateX(0) translateY(-30px); }
	input[type="text"], input[type="password"] { position: relative; width: 300px; height: 30px; border-radius: 5px; border: 1px solid #DCDCDC; z-index: 1; padding-left: 10%; box-sizing: border-box; transform: translateX(0); transition: 1s; }
	input:focus { padding-left: 2%; }
	input:focus + span.myactive, textarea:focus + span { transform: translateY(-30px) translateX(-100%); transition: 1s; }
	select, input[type="file"] { transform: translateX(100px); border: 1px solid #DCDCDC; border-radius: 5px; width: 200px; height: 30px; }
	input[type="radio"] { transform: translateX(110px); }
	#intro { position: relative; top: -181px; }
	textarea { border: 1px solid #DCDCDC; border-radius: 5px; }
	p { display: inline; position: relative; left: 110px; }
</style>
<script>
	$(document).ready(function() {
		$("#submit").click(function(e) {
			if($("#pass").val() != $("#passConfirm").val()) {
				e.preventDefault();
				alert("비밀번호가 일치하지 않습니다.");
			}
		})
	});
</script>
</head>
<body>
<c:import url="/include/header.jsp"/>
<div class="container-fluid">
    <!-- Begin page content -->
    <div class="container" id="maincontainer">
      <div class="page-header">
      	<!-- 제목 -->
        <h1>회원가입</h1>
      </div>
    </div>

    <footer class="footer">
      <div class="container">
        <!-- 내용 -->
        <form action="join" method="post" enctype="multipart/form-data">
        	<input type="text" name="id">
        	<span class="myactive">아이디</span>
      		<input type="password" name="pass" id="pass">
        	<span class="myactive">비밀번호</span>
      		<input type="password" name="pass" id="passConfirm">
        	<span class="myactive">비밀번호확인</span>
        	<input type="text" name="name">
        	<span class="myactive">이름</span>
        	<select name="birth" id="selectBox">
   				<c:forEach var="year" begin="1980" end="2016" >
   					<option value="<c:out value="${year}"/>"><c:out value="${year}"/></option>
   				</c:forEach>
   			</select>
   			<span>생년</span>
   			<input type="radio" name="gender" value="M" checked="checked"> <p class="gender">남자</p>
   			<input type="radio" name="gender" value="W">  <p class="gender">여자</p>
   			<span>성별</span>
   			<input type="file" name="profileFile">
   			<span>프로필사진</span>
   			<textarea rows="10" cols="50" name="intro"></textarea>
   			<span id="intro">자기소개</span>
   			<button type="submit" id="submit">가입</button>
        	<button type="reset">취소</button>
        </form>
      </div>
    </footer>
</div>
<%@ include file="/include/bottom.jsp" %>
</body>
</html>