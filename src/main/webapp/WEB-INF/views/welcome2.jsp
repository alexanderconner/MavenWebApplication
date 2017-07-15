<%@ include file="../common/header.jspf"%>

<div class="container">

	<p>
		<font color="red"> ${loginError}</font>
	</p>
	
	<div class="card card-container">
	<h1><spring:message code="welcome.caption"/></caption></h1>
<p>you are ${user} and password is ${password}. </p>
</br>
<p>Now you can <a href="list-todos">manage your todos</a></p>
</div>

<%@ include file="../common/footer.jspf"%>
