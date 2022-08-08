<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="resources/css/Style1.css">
</head>
<body>

 <form action="LoginServlet" method="post">
    <div align= "center">
    <h3>Login</h3>
    
        <label for="username">Username</label>
        <input type="text" placeholder="Email" name="username"><br></br>

        <label for="password">Password</label>
        <input type="password" placeholder="Password" name="password"><br></br>
        
        
        
        </div>
        
  <div align="center">
  <button>Login</button>
  </div>
 </form>


</body>
</html>