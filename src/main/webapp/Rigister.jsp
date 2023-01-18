
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>
<body>
<div class="container-md">
	<form action="RegisterServlet" method="post">
		<div class="mb-3">
		  <label for="Username" class="form-label">User Name : </label>
		  <input type="text" class="form-control" name="username">
		</div>
		<div class="mb-3">
		  <label for="Address" class="form-label">Address : </label>
		  <input type="text" class="form-control" name="address">
		</div>
		<div class="mb-3">
		  <label for="Password" class="form-label">Password : </label>
		  <input type="text" class="form-control" name="password">
		</div>
		<input type="submit" value="submit">
	</form>
	</div>
</body>
</html>