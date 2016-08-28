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
       
      </div>
    </footer>
</div>
<%@ include file="/include/bottom.jsp" %>
</body>
</html>