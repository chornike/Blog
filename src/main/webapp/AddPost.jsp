<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Post</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>
<body>
<div class="container-md">
	<form action="AddServlet" method="post">
		<div class="mb-3">
		  <label for="Title" class="form-label">Title : </label>
		  <input type="text" class="form-control" name="title">
		</div>
		<div class="mb-3">
		  <label for="Description" class="form-label">Description : </label>
		  <input type="text" class="form-control" name="description">
		</div>
		<div class="mb-3">
		  Visibility :
		  <select name="visibility" >
		  <option value="private"> </option>
			  <option value="private">Private</option>
			  <option value="public">Public</option>
		</select>
		
		</div>
		<input type="submit" value="submit">
	</form>
	</div>
</body>
</html>