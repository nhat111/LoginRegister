<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>signup</title>
<style><%@include file="/WEB-INF/css/signup.css"%></style>
</head>
<body>
<form action="#" method="post">
		<h2>Sign Up</h2>
		<p>
			<label for="uname" class="floatLabel">Username</label>
			<input id="uname" name="userName" type="text">
		</p>
		<p>
			<label for="password" class="floatLabel">Password</label>
			<input id="password" name="password" type="password">
			<span style="display: none;"> password at least 8 digit, has at least 1 special character</span>
		</p>
		<p>
			<label for="fname" class="floatLabel">First Name</label>
			<input id="fname" name="firstName" type="text">
		</p>
		<p>
			<label for="lname" class="floatLabel">Last Name</label>
			<input id="lname" name="lastName" type="text">
		</p>
		<p>
			<label for="bday" class="floatLabel">Birthday</label>
			<input id="bday" name="birthDay" type="text">
		</p>
		<p>
			<label for="gender" class="floatLabel">Gender</label>
			<input id="gender" name="gender" type="text">
		</p>
		<p>
			<label for="adres" class="floatLabel">Address</label>
			<input id="adres" name="address" type="text">
		</p>
		<p>
		
		<input type="submit" value="Sign Up" id="submit">
			
		</p>
	</form>
	<!--js-->
	<script type="text/javascript" src="js/application.js"></script>
</body>
</html>
