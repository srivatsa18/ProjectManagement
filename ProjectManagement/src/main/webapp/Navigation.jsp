<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<Head>      
<Title>     
Make a Navigation Bar  
</Title>  
</Head>
<style>
	body{
	   
		background-color: #8dd8c7;
		box-sizing: content-box;
		
	}

</style> 
    <style>
    .vertical-menu ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    width: 200px;
    background-color: #0018c3;
    border: 1px solid #555;
}
/* Designing the link items */
.vertical-menu li a {
    display: block;
    color: #fff;
    padding: 8px 0 8px 16px;
    text-decoration: none;
}
/* Changing the background and font color of the link when hovered. */
.vertical-menu li a:hover {
    background-color: #111;
}
/* Adding border bottom each list items as divider and aligning the text */
.vertical-menu li {
    text-align: center;
    border-bottom: 1px solid #555;
}
Removing the right border of the list last item/
.vertical-menu li:last-child {
    border-bottom: none;
}
/*Changing the background color of the active link item */
.vertical-menu .active {
    background-color: #1cbb09;
}
   </style>
 </head>
 
<body>
    <nav class="navbar navbar-default " role="navigation">
	  <div class="container-fluid">
	    <div class="navbar-header">
		  	<div class="vertical-menu">
		        <ul>
			        <li>
			        	<form action="ProjectDetailsServlet" method="post">
			        		<button type="submit" name="ProjectDetails">Project Details</button>
			        	</form>
			        </li>
		        	
		        	<li>
			        	<form action="AddServlet" method="post">
			        		<button type="submit" name="AddProjectDetails">Add Project</button>
			        	</form>
		        	</li>
		
					<li>
			        	<form action="DeleteServlet" method="post">
			        		<button type="submit" name="DeleteProjectDetails">Delete Project</button>
			        	</form>
			        </li>
			    </ul>
	    	</div>
	    </div>
	  </div>
    </nav>
	</body>
</html>
