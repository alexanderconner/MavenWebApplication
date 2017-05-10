<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Woohoo from JSP</title>
</head>
<body>
	<p><font color="red"> ${loginError}</font></p>
	<form action="/login.do" method="post">
		Enter your username: <input type="text" name="username"/> 
		<br>
		Enter your password: <input type="text" name="password"/>
		<br>
		<input type="submit" name="submit" value="Submit"/>
		
		<br><small>
		<a href="/resetpassword"><i>Forgot your password?</i></a>
		</small>
	
	</form>

</body>
</html>