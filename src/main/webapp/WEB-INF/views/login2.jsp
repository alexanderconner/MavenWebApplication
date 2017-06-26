<%@ include file="../common/header.jspf"%>

<div class="container">

	<p>
		<font color="red"> ${loginError}</font>
	</p>
	
	<div class="card card-container">
	<h1>THIS IS LOGIN 2</h1>
	<form action="/login2" method="post" class="form-signin">
		<input type="text" name="username" class="form-control" placeholder="Email address" required autofocus/> <br>
		<input type="password" name="password" class="form-control" placeholder="Password" required /> <br> 
		<button
			type="submit" name="submit" value="Submit" class="btn btn-lg btn-primary btn-block btn-signin" 
			>Sign In
		</button> <br>
		<small> <a href="/resetpassword"><i>Forgot your
					password?</i></a>
		</small>
		</div><!--card-container  -->
	</form>

</div>

<%@ include file="../common/footer.jspf"%>
