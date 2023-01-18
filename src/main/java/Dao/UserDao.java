package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.User;

public class UserDao {
	private static Connection getConnection() {
		Connection connect = null;
		String urlConnect = "jdbc:mysql://localhost:3306/my_blog?useSSL=false";
		String userName = "root";
		String password = "Chornike010757005";
		String driverClass = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driverClass);
			connect = DriverManager.getConnection(urlConnect, userName, password);
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return connect;
	}
	
	public static int registerUser(User user) throws ClassNotFoundException{
		String sql = "INSERT INTO user VALUES(?, ?, ?)";
		Connection connect = getConnection();
		
		int status = 0;
		
		try {
			
			PreparedStatement statement = connect.prepareStatement(sql);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getAddress());
			statement.setString(3, user.getPassword());
			
			
			status = statement.executeUpdate(); //0 failed, > 0 success
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {connect.close();} catch (SQLException e) {}
		}
		
		return status;
	}

}
