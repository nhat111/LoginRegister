<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>profile</title>
	<style><%@include file="/WEB-INF/css/signup.css"%></style>
</head>

<body>

	<form action="#" method="post">
		<h2>${lastName } ${firstName }</h2>
		<p>
			<label for="uname" class="floatLabel">Username</label>
			<input id="uname" name="userName" type="text" value="${userName}">
		</p>
		
		<p>
			<label for="fname" class="floatLabel">First Name</label>
			<input id="fname" name="firstName" type="text" value="${firstName}">
		</p>
		<p>
			<label for="lname" class="floatLabel">Last Name</label>
			<input id="lname" name="lasttName" type="text"value="${lastName }">
		<p>
			<label for="lname" class="floatLabel">Birthday</label>
			<input id="lname" name="birthDay" type="text"value="${birthDay}">
		</p>
		<p>
			<label for="gender" class="floatLabel">Gender</label>
			<input id="gender" name="gender" type="text" value="${gender}">
		</p>
		<p>
			<label for="adres" class="floatLabel">Address</label>
			<input id="adres" name="address" type="text" value="${address}">
		</p>
	</form>

</body>

</html>
