package com.mindtree.player_auction;

// step 1: use interfaces from java.sql package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// contains the database connection code
// should not handle any exception must throw it back to the Manager class
// 
public class JDBCMySQLConnection {
	
	//static reference to itself
	private static JDBCMySQLConnection instance = new JDBCMySQLConnection();	
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
//	public static final String URL = "jdbc:mysql://localhost:3306/player_db/team";
	public static final String URL = "jdbc:mysql://localhost:3306/player_db";
//	public static final String USER = "root@localhost";
	public static final String USER = "root";
	public static final String PASSWORD = "Welcome123";
	
   // private constructor
	private JDBCMySQLConnection() {
		try {
			// step 2: load MYSQL java driver
			Class.forName(DRIVER_CLASS);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Connection createConnection() {
		Connection connection = null;
		try {
			// step 3: Establish Java MySQL connection
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch(SQLException e) {
			System.out.println("Error: unable to connect to database");
		}
		return connection;
	}
	
	public static Connection getConnection() {
		return instance.createConnection();
	}

	/*void connect_with_db() throws SQLException {
		Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
		
		
	}*/

}
