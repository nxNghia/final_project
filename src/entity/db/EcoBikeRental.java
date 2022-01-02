package entity.db;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import utils.Configs;

public class EcoBikeRental {
	
	
	public static Connection getConnection() {
		Connection res;
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
			Properties info = new Properties();
			info.put("user", Configs.DB_USERNAME);
			info.put("password", Configs.DB_PASSWORD);
			res = DriverManager.getConnection(Configs.DB_URL, info);
		} catch (SQLException e) {
			e.printStackTrace();
			res = null;
		}
		
		return res;
	}
}
