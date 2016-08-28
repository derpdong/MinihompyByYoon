<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="/include/header.jsp" />
	<div class="container-fluid">
		<!-- Begin page content -->
		<div class="container" id="maincontainer">
			<div class="page-header">
				<!-- 제목 -->
				<h1>방명록 남기기</h1>
			</div>
		</div>

		<footer class="footer">
			<div class="container">
				<!-- 내용 -->
				<table width='80%' border='1'>
					<div id="writeForm">
						<form action="${pageContext.request.contextPath}/bookWrite"	method="post">
							글 쓴 사람 : <input type='text' name='writerUserName'	readonly="readonly" value="yoon" /><br>
						<!--수정요망 -->
							<input type="hidden" name="writerUserNo" value="1">
							<textarea rows='5' cols='50' name='content' /></textarea>
							<br>

							<button type="submit" onclick="return confirm('방명록을 등록할까요?')">방명록 남기기</button>
						</form>


					</div>
				</table>
			</div>
		</footer>

		<script>
			
		</script>
	</div>
	<%@ include file="/include/bottom.jsp"%>
</body>
</html>