<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tf" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
</head>
<body>
	<p>아이디: ${member.id}</p>
	<p>이메일: ${member.email}</p>
	<p>이름: ${member.name}</p>
	<p>가입일: <tf:formatDateTime value="${member.registerDateTime}" pattern="yyyy-MM-dd HH:mm"/>
</body>
</html>