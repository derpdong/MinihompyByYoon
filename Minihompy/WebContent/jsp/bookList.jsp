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
</head>
<body>
<c:import url="/include/header.jsp"/>
<div class="container-fluid">
    <!-- Begin page content -->
    <div class="container" id="maincontainer">
      <div class="page-header">
      	<!-- 제목 -->
        <h1>방명록</h1>
      </div>
    </div>
    
    <footer class="footer">
      <div class="container">
        <!-- 내용 -->
        <a href='${pageContext.request.contextPath}/bookWriteForm'>방명록 남기기</a>
        <table width='80%' border='1'>
        
        <c:forEach var="book" items="${list}">
        	<tr>
			<td><c:out value="${book.content}"/></td>
			<td><c:out value="${book.writer}" /></td>
			<td>
				<fmt:formatDate var="regDate" value="${book.regDate}" pattern="yyyy-MM-dd"/>
				<c:out value="${regDate}" />
			</td>
			</tr>
		</c:forEach>
		<c:if test="${empty list}">
			<tr><td colspan='4'>아직 방명록이 없네요! 하나 써보세요ㅎㅎ</td></tr>
		</c:if>
		</table>
		

      </div>
    </footer>
</div>
<%@ include file="/include/bottom.jsp" %>
</body>
</html>