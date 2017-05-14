<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>todo</title>
</head>
<body>
<p>Welcome ${name}!</p>
<p>Your todo list is:</p>
<ol>
	<c:forEach items="${todos}" var="todo">
		<li>${todo.name}</li>	
	</c:forEach>
</ol>

<form action="/todo.do" method="post">
	<input type="text" name="newtodo"/> <input type="submit" value="Add"/>
	
</form>
</body>
</html>