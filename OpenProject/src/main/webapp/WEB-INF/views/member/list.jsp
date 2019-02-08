<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원리스트</title>
<style>
li{
list-style:none;
}
ul{
display:flex;
flex-direction:row;
justify-content:space-around;
}
a{
text-decoration:none;
color:black;
}
</style>
</head>
<body>
	<h1>
		Open project
	</h1>
	<hr>
	<ul>
		<li><a href="#">회원가입</a></li>
		<li><a href="#">로그인</a></li>
		<li><a href="member/list">회원리스트</a></li>
		<li><a href="#">방명록</a></li>
	</ul>
	<hr>
<h1>회원리스트</h1>
<c:forEach items="${members}" var="member">
<h3>
${member.id} | ${member.name} | ${member.password} | ${member.email} | 
</h3>
</c:forEach>
</body>
</html>