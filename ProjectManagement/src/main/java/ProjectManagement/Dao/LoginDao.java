package ProjectManagement.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ProjectManagement.Utilities.DBConnectionUtility;

public class LoginDao {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	Statement statement = null;
	
	public boolean loginCheck(String uname, String pass) throws ClassNotFoundException, SQLException {
		String query = "Select user_password from ProjectManagementDB.Login where user_name='"+uname+"';";
		
		connection = DBConnectionUtility.getDBConnection();
		statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(query);
		rs.next();
		String psd = rs.getString("user_password");
		if(pass.equals(psd)) return true;
		else return false;
	}
}
