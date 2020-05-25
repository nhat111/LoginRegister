<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Login and Registration form example</title>

<link rel="stylesheet" type="text/css" href="./login.css">

</head>

<body bgcolor="#E6E6FA">

	<div id="container">
		<form method="post">

			<h2>Login</h2>

			<label for="uname" id="un">Username:</label> <input type="text"
				name="userName" id="uname"><br /> <br /> <label
				for="upass" id="ps">Password:</label> 
				<input type="password"name="password" id="upass"><br /> <br />
			<button type="submit" value="Submit" >Login</button>

			<a href="signup">Signup</a>

		</form>
	</div>

</body>
</html>
