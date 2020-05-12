<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Login and Registration form example</title>

<link href="./css/register.css" type="text/css" rel="stylesheet" />

</head>

<body bgcolor="#E6E6FA">

	<div id="container">
		<form method="post">

			<h2>Signup</h2>
			
			<label for="uname" id="un">UserName:</label> <input type="text"
				name="userName" id="uname"><br /> <br />
				
            <label for="upass" id="ps">Password:</label> <input type="password"
				name="password" id="upass"><br /> <br />
				
				<label for="fname" id="un">FirstName:</label> <input type="text"
				name="firstName" id="uname"><br /> <br />
				
				<label for="lname" id="un">LastName:</label> <input type="text"
				name="lastName" id="uname"><br /> <br />
				
				<label for="bday" id="un">BirthDay:</label> <input type="text"
				name="birthDay" id="uname"><br /> <br />
				
				<label for="gender" id="un">Gender:</label> <input type="text"
				name="gender" id="uname"><br /> <br />
				
				<label for="address" id="un">Address:</label> <input type="text"
				name="address" id="uname"><br /> <br />
					
			<button type="submit" value="Submit">Signup</button>

			<a href="login">Login</a>

		</form>
	</div>

</body>
</html>
