<%@ include file="../common/header.jspf"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

Added todo

	<div class="container">
		<H1>Your new ToDo item:</H1>	

		<form:form action="/add-todo" method="post" commandName="todo">
		
			<fieldset class="form-group">
				<form:label path="desc">Description:</form:label> 
				<form:input path="desc" type="text" class="form-control" required="required"/> 
				<form:errors path="desc" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
				<label>Category:</label> <input name="category" type="text" class="form-control" required="required"/> 
			</fieldset><br/>
			<input type= "submit" value="add" class="btn btn-success"/> <br/>
			
		</form:form>

		<p>
			<font color="red">${errorMessage}</font>
		</p>
	</div>

<%@ include file="../common/footer.jspf" %>