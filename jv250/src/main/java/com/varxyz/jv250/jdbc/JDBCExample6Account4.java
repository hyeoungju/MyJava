package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample6Account4 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; //인터넷에서 찾으면 된다 외울것은 아니고
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul"; //어디다가 적어둬라, timezone은 옵션 시스템에 문제가있을까봐?
		String id = "jv250";
		String passwd = "jv250";
		
		//driver 생성 자바에서 한다.
		try {
			Class.forName(driver);
			System.out.println("LOADED DRIVER ---->" + driver);
			
			Connection con = DriverManager.getConnection(url, id, passwd); //drivermanager 는 static 
			System.out.println("CONNECTED TO ----->" + url);
			
			String sql = "UPDATE Account SET balance=? WHERE aid=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setDouble(1, 2000.0);
			stmt.setLong(2, 3002);
			stmt.executeUpdate();
			
			sql = "UPDATE Account SET balance=? WHERE aid=?";
			stmt = con.prepareStatement(sql);
			stmt.setDouble(1, 3000.0);
			stmt.setLong(2, 3002);
			stmt.executeUpdate();
			
			sql = "UPDATE Account SET customerId=? WHERE aid=?";
			stmt = con.prepareStatement(sql);
			stmt.setLong(1, 1001);
			stmt.setLong(2, 3001);
			stmt.executeUpdate();
			
			sql = "UPDATE Account SET customerId=? WHERE aid=?";
			stmt = con.prepareStatement(sql);
			stmt.setLong(1, 1003);
			stmt.setLong(2, 3003);
			stmt.executeUpdate();
			
			System.out.println("UPDATED....");
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
