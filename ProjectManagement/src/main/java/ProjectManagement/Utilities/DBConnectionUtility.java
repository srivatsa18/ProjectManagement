package ProjectManagement.Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtility {
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Srivatsa@123";
	private static final String URL = "jdbc:mysql://localhost:3306";
	
	private Connection connection = null;
	
	public static Connection getDBConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		return con;
	}
}
