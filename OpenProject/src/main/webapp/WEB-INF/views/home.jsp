<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<head>
<link rel="stylesheet" href="css/nav.css">
<title>Home</title>
<style type="text/css">
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
		<li><a href="member/reg">회원가입</a></li>
		<li><a href="#">로그인</a></li>
		<li><a href="member/list">회원리스트</a></li>
		<li><a href="#">방명록</a></li>
	</ul>
	<hr>
</body>
</html>
