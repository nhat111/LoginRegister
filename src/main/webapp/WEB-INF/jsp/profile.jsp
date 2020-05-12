<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<!DOCTYPE html>
<html lang="en">
<head>
	<style>
		body {
			padding-top: 70px;
			
		}

		.othertop{margin-top:10px;}
	</style>


</head>

<body>

	<div class="container">
		<div class="row">
			<div class="col-md-10 ">
				<form class="form-horizontal">
					<fieldset>
<!-- username-->
						<div class="form-group">
							<label class="col-md-4 control-label">username</label>  
							<div class="col-md-4">
								<div class="input-group">
									<div class="input-group-addon">
										<i class="fa fa-user">
										</i>
									</div>
									<input  type="text" class="form-control input-md" value= ${userName}  >
								</div>
							</div>
						</div>
<!--First Name-->
						<div class="form-group">
							<label class="col-md-4 control-label">First Name</label>  
							<div class="col-md-4">
								<div class="input-group">
									<div class="input-group-addon">
										<i class="fa fa-user">
										</i>
									</div>
									<input  type="text" class="form-control input-md" value=${firstName}>
								</div>
							</div>
						</div>
<!--lastName--->
						<div class="form-group">
							<label class="col-md-4 control-label">Last Name</label>  
							<div class="col-md-4">
								<div class="input-group">
									<div class="input-group-addon">
										<i class="fa fa-user">
										</i>
									</div>
									<input  type="text" class="form-control input-md" value=${lastName}>
								</div>
							</div>
						</div>
<!--birthDay-->
						<div class="form-group">
							<label class="col-md-4 control-label">Brithday</label>  
							<div class="col-md-4">
								<div class="input-group">
									<div class="input-group-addon">
										<i class="fa fa-user">
										</i>
									</div>
									<input  type="text" class="form-control input-md" value=${birthDay}>
								</div>
							</div>
						</div>
<!--gender-->
						<div class="form-group">
							<label class="col-md-4 control-label">Gender</label>  
							<div class="col-md-4">
								<div class="input-group">
									<div class="input-group-addon">
										<i class="fa fa-user">
										</i>
									</div>
									<input  type="text" class="form-control input-md" value=${gender}>
								</div>
							</div>
						</div>
<!--address-->
						<div class="form-group">
							<label class="col-md-4 control-label">Address</label>  
							<div class="col-md-4">
								<div class="input-group">
									<div class="input-group-addon">
										<i class="fa fa-user">
										</i>
									</div>
									<input  type="text" class="form-control input-md" value=${address}>
								</div>
							</div>
<!---->						</div>

					</fieldset>
				</form>
			</div>
		</div>
	</div>


</body>

</html>
