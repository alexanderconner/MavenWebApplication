<%@ include file="../common/header.jspf"%>

Added todo

	<div class="container">
		<H1>Your new ToDo item:</H1>
		
		

		<form action="/add-todo" method="post">
			<fieldset class="form-group">
				<label>Description:</label> <input name="desc" type="text" class="form-control"/> 
			</fieldset>
			<fieldset class="form-group">
				<label>Category:</label> <input name="category" type="text" class="form-control"/> 
			</fieldset><br/>
			<input type= "submit" value="add" class="btn btn-success"/> <br/>
		</form>

		<p>
			<font color="red">${errorMessage}</font>
		</p>
	</div>

<%@ include file="../common/footer.jspf" %>