<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AddProject</title>
</head>
<body>
   <div class="container">
     <h1>Add project</h1>
     <form action="AddProjectServlet" method="post">
     	<label>Project Id:</label>
        <input type="text" name="projectID" id="txtProjectName" class="form-control" value="" required>
        <br></br>
        
        <label>Project Organization Name:</label>
        <input type="text" name="projOrgName" id="txtProjectName" class="form-control" value="" required>
        <br></br>
        
        <label>Project Requirement:</label>
        <input type="text" name="projRequirement" id="txtProjectRequirements" class="form-control" value="" required>
        <br></br>
        
        <label>Project Manager:</label>
        <input type="text" name="projManager" id="txtReceivingDate" class="form-control" value="" required>
        <br></br>
        
        <label>Solution Architect:</label>
        <input type="text" name="solutionArchitect" id="txtExceptedDate" class="form-control" value="" required>
        <br></br>
        
        <label>Date of receiving Project:</label>
        <input type="text" name="dateOfReceivingProj" id="txtExceptedDate" class="form-control" value="" required>
        <br></br>
        
        <label>Expected completion Date:</label>
        <input type="text" name="expectedCompletionDate" id="txtExceptedDate" class="form-control" value="" required>
        <br></br>
        
         <button type="submit" value="Add" class="btn btn-primary save-btn">Add</button>
       </form>
   </div>
</body>
</html>