package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {
		
		public static Connection getConnection() {
			Connection conn = null;
			
			try {
				//드라이버 객체 로딩
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				
				//커넥션 연결
				String URL = "jdbc:mysql://localhost:3306/zerobase_db";
				String USER = "zerobase1";
				String PASSWORD = "zerobase123";
				conn = DriverManager.getConnection(URL,USER,PASSWORD);
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
			return conn;
		}
		
		public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {

	        try {
	            if (rs != null && ! rs.isClosed()) {
	                rs.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        try {
	            if (stmt != null && ! stmt.isClosed()) {
	                stmt.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        try {
	            if (conn != null && ! conn.isClosed()) {
	                conn.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		}
	}


