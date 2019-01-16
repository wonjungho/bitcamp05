<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="css/nav.css">
<style>
td{
display:felx;
justify-content:space-between;
}
</style>
</head>
<body>
<h1><a href="index.jsp">Open project</a></h1>
<hr>
<ul>
<li><b><a href="#">회원가입</a></b></li>
<li><b><a href="#">회원로그인</a></b></li>
<li><b><a href="#">회원마이페이지(회원)</a></b></li>
<li><b><a href="#">사원리스트</a></b></li>
<li><b><a href="#">사원등록</a></b></li>
</ul>
<hr>
<h2>회원가입</h2>
<hr>
<form action="Regaction.jsp" method="post">
<table>
<tr>
<td>아이디(이메일)</td>
<td><input type="text" name="uid" size="10"></td>
</tr>
<tr>
<td>비밀번호</td>
<td><input type="password" name="upwd" size="10"></td>
</tr>
<tr>
<td>이름</td>
<td><input type="text" name="uname" size="6"></td>
</tr>
<tr>
<td>사진</td>
<td><input type="file" name="upic"></td>
</tr>
<tr>
<td><input type="submit" value="가입"></td>
</table>
</form>
</body>
</html>