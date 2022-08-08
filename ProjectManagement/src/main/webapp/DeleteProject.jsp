<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="container">
			<h1> Delete Project</h1>
			<form id="Deleteprojectform" action="DeleteProjectServlet" method="post">
				<label>Project Id:</label>
				 <input type="text" name="projectID" id="txtProjectName" class="form-control" value="" required>
				<br></br>
				
				<button type="submit" value="Delete" class="btn btn-primary save-btn">Delete</button>
			</form>
		</div>
	</body>
</html>