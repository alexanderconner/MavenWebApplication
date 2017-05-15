<!--  this is for adding tags so we can use foreach loops on our todo list items. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
	
<title>todo</title>
	
</head>
<body>
	<p>Welcome ${name}!</p>
	<p>Your todo list is:</p>
	<ol>
		<c:forEach items="${todos}" var="todo">
			<!-- pass the list item as a parameter to the servlet for DeleteToDoService. -->
			<li>${todo.name}&nbsp; &nbsp; <a
				href="/delete-todo.do?deletetodo=${todo.name}">Delete</a>
			</li>
		</c:forEach>
	</ol>

	<form action="/todo.do" method="post">
		<input type="text" name="newtodo" /> <input type="submit" value="Add" />

	</form>
	
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>