package ProjectManagement.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ProjectManagement.Model.Benchpool;
import ProjectManagement.Model.ProjectAllocated;
import ProjectManagement.Utilities.DBConnectionUtility;

public class ProjectAllocatedDao {

	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private Statement statement = null;
	
	public ArrayList<Benchpool> getBenchpool() throws ClassNotFoundException, SQLException {
		String query = "Select * from ProjectManagementDB.Benchpool;";
		ArrayList<Benchpool> benchpoolList = new ArrayList<>();
		
		connection =  DBConnectionUtility.getDBConnection();
		statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(query);
		
		while(rs.next()) {
			Benchpool benchpool = new Benchpool();
			benchpool.setDeptName(rs.getString("Department"));
			benchpool.setMembers(rs.getInt("No_of_members"));
			benchpoolList.add(benchpool);
		}
		return benchpoolList;
	}

	public void updateBenchpool(String orgName, String deptName, int allocated, int remainingMembers) throws ClassNotFoundException, SQLException {
		String query = "update ProjectManagementDB.ProjectAllocated set "+deptName+"="+allocated+" where proj_Org_Name='"+orgName+"';";
		System.out.println(query);
		connection = DBConnectionUtility.getDBConnection();
		statement = connection.createStatement();
		statement.executeUpdate(query);
	}
}
	

