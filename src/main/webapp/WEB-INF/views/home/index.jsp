<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>我的首页  微博-随时随地发现新鲜事</title>
	</head>
	<body>
	
		<div>
			关注<a href="#">${sessionScope.account.follow }</a>|
			粉丝<a href="#">${sessionScope.account.fans }</a>|
			微博<a href="#">${sessionScope.account.weibo }</a>
		
		</div>
		
		<div>
			<c:forEach items="${pi.list }" var="w">
			<div>
				<h3>${w.account.name }</h3>
				<p>${w.content }</p>
			</div>
		
			</c:forEach>
		</div>
	
	</body>
</html>