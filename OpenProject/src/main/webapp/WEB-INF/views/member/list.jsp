<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원리스트</title>
</head>
<body>
<div class="header">
<jsp:include page="../header/header.jsp"/>
</div>
<h2>회원리스트</h2>
<c:forEach items="${members}" var="member">
<h3>
${member.id} | ${member.name} | ${member.password} | ${member.email} | 
</h3>
</c:forEach>
</body>
</html>