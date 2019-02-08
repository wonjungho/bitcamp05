<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h1>회원가입</h1>
	<hr>
	<form action="insertMember">
		<table>
			<tr>
				<td>아이디(이메일)</td>
				<td><input type="text" name="email" size="10"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password" size="10"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" size="6"></td>
			</tr>
			<tr>
				<td>사진</td>
				<td><input type="file" name="photo"></td>
			</tr>
			<tr>
				<td><input type="submit" value="가입"></td>
		</table>
	</form>
</body>
</html>