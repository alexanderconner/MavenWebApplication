<%@ include file="../common/header.jspf"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

	<div class="container">
		<H1>Your new ToDo item:</H1>	

		<form:form method="post" commandName="todo">
		
			<form:hidden path="id"/>
			
			<fieldset class="form-group">
				<form:label path="desc">Description:</form:label> 
				<form:input path="desc" type="text" class="form-control" required="required"/> 
				<form:errors path="desc" cssClass="text-warning" />
			</fieldset>
			<br/>
			
			<fieldset class="form-group">
				<form:label path="targetDate">Target Date:</form:label> 
				<form:input path="targetDate" type="text" class="form-control" required="required"/> 
				<form:errors path="targetDate" cssClass="text-warning" />
			</fieldset>
			<br/>
			<input type= "submit" value="Submit" class="btn btn-success"/> <br/>
			
		</form:form>

		<p>
			<font color="red">${errorMessage}</font>
		</p>
	</div>

<%@ include file="../common/footer.jspf" %>