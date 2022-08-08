<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
     <h1>Project Allocate</h1>
     
     
     <div class="row">
       <div class="col-sm-4">
           <form method="post" action="BenchpoolServlet">
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
			        <c:set var="project" value="${project}"></c:set>
		        	<tr>
			           <td><c:out value="${project.projectID}"></c:out></td>
			           <td><c:out value="${project.projOrgName}"></c:out></td>
			           <td><c:out value="${project.projRequirement}"></c:out></td>
			           <td><c:out value="${project.projManager}"></c:out></td>
			           <td><c:out value="${project.solutionArchitect}"></c:out></td>
			           <td><c:out value="${project.dateOfReceivingProj}"></c:out></td>
			           <td><c:out value="${project.expectedCompletionDate}"></c:out></td>
		        	</tr>
				</table>
				<c:set var="projOrgName" value="${project.projOrgName}"></c:set>
				<input type="hidden" name="orgName" value="<% out.println(pageContext.getAttribute("projOrgName")); %>" readonly> 
				
				<div class="col-sm-8">
	                <h1>Benchpool</h1>
					      <table>
					         <tr>
					            <th>Department</th>
					            <th>No of Members</th>
					            <th>Members allocated</th>
					         </tr>
					         
					         <c:set var="i" value="0"></c:set>
					         <c:forEach var="benchpool" items="${benchpool}">
						         <tr>
						            <td><c:out value="${benchpool.deptName}"></c:out></td>
						            <td><c:out value="${benchpool.members}"></c:out></td>
						            <td><input type="text" name="${i}"></td>
						         </tr>
						         <c:set var="i" value="${i+1}"></c:set>
						     </c:forEach>
					     </table>
					     <button>Allocate</button>
            	</div>
			</form>
		</div>
	</div>
</html>