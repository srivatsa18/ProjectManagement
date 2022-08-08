<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<style>
	body{
	   
		background-color: #8dd8c7;
		box-sizing: content-box;
		border: 2px solid;
	}
	
	table, th, td {
			text-align:center;
            border: 1px solid black;
    }
</style>


<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	        
 
<body>
     <h1>Project Details</h1>
     
     
     <div class="row">
       <div class="col-sm-4">
           <form method="post" action="AddProjectServlet">
	           <table>
			        <tr>
			           <td>Project ID</td>
			           <td>Organization Name</td>
			           <td>Project Requirement</td>
			           <td>Project Manager</td>
			           <td>Solution Architect</td>
			           <td>Date of Receiving</td>
			           <td>Expected Completion Date</td>
			        </tr>
			        <c:forEach var="project" items="${project}">
			        	<tr>
				           <td><c:out value="${project.projectID}"></c:out></td>
				           <td><c:out value="${project.projOrgName}"></c:out></td>
				           <td><c:out value="${project.projRequirement}"></c:out></td>
				           <td><c:out value="${project.projManager}"></c:out></td>
				           <td><c:out value="${project.solutionArchitect}"></c:out></td>
				           <td><c:out value="${project.dateOfReceivingProj}"></c:out></td>
				           <td><c:out value="${project.expectedCompletionDate}"></c:out></td>
			        	</tr>
			        </c:forEach>
				</table>
				<div class="col-sm-8">
	                <h1>Benchpool</h1>
					      <table>
					         <tr>
					            <th>Department</th>
					            <th>No of Members</th>
					         </tr>
					         
					         <c:forEach var="benchpool" items="${benchpool}">
						         <tr>
						            <td><c:out value="${benchpool.deptName}"></c:out></td>
						            <td><c:out value="${benchpool.members}"></c:out></td>
						         </tr>
						     </c:forEach>
					     </table>
            	</div>
			</form>
		</div>
    	 </div>
	</body>
</html>