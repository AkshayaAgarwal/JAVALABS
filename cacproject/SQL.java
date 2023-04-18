package cacproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQL {
	private Connection connect;

	public SQL() {
		try {
			this.connect = DriverManager.getConnection("jdbc:mysql://localhost/swing_demo", "root", "85657784");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			this.connect = null;
			e.printStackTrace();
		}
	}

	public Connection getConnect() {
		return connect;
	}

	public void closeConnection() {
		try {
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
