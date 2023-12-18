package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Database.DBConnect;


public class WifiDao {

		private Connection conn = null;
		private PreparedStatement stmt = null;
		private ResultSet rs = null;
		
		private String sql = "select * from id";
		
		public void WifiDao() {
			try {
				conn = DBConnect.getConnection();
				stmt = conn.prepareStatement(sql);
				rs = stmt.executeQuery();
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBConnect.close(rs, stmt, conn);
			}
		}
}


