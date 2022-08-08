package ProjectManagement.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ProjectManagement.Model.Project;
import ProjectManagement.Utilities.DBConnectionUtility;

public class ProjectDetailsDao {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	Statement statement = null;
	
    public ResultSet getProjectDetails() throws ClassNotFoundException, SQLException{
    	String query = "Select * from ProjectManagementDB.ProjectDetails;";
    	connection = DBConnectionUtility.getDBConnection();
    	statement = connection.createStatement();
    	ResultSet rs = statement.executeQuery(query);
    	return rs;
    }
    
    public void addProjectDetails(Project project) throws ClassNotFoundException, SQLException {
    	String query = "Insert into ProjectManagementDB.ProjectDetails values(?,?,?,?,?,?,?);";
    	
    	connection = DBConnectionUtility.getDBConnection();
    	preparedStatement = connection.prepareStatement(query);
    	
    	preparedStatement.setString(1, project.getProjectID());
		preparedStatement.setString(2, project.getprojOrgName());
		preparedStatement.setString(3, project.getprojRequirement());
		preparedStatement.setString(4, project.getprojManager());
		preparedStatement.setString(5, project.getsolutionArchitect());
		preparedStatement.setString(6, project.getdateOfReceivingProj());
		preparedStatement.setString(7, project.getexpectedCompletionDate());
		preparedStatement.executeUpdate();
    }
    
    public void initialiseBenchpool(String orgName) throws ClassNotFoundException, SQLException {
    	String query = "insert into ProjectManagementDB.ProjectAllocated values(?,?,?,?,?,?,?);";
    	
    	connection = DBConnectionUtility.getDBConnection();
		preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, orgName);
		preparedStatement.setInt(2, 0);
		preparedStatement.setInt(3, 0);
		preparedStatement.setInt(4, 0);
		preparedStatement.setInt(5, 0);
		preparedStatement.setInt(6, 0);
		preparedStatement.setInt(7, 0);
		preparedStatement.executeUpdate();
    }
    
    public void deleteProject(String id) throws ClassNotFoundException, SQLException {
    	String query = "Delete from ProjectManagementDB.ProjectDetails where project_ID='"+id+"';";
    	connection = DBConnectionUtility.getDBConnection();
    	statement = connection.createStatement();
    	statement.executeUpdate(query);
    }
}


