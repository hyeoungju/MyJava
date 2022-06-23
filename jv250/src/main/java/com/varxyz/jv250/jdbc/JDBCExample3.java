package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample3 {
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
			
		
			String sql = "INSERT INTO Customer(name, ssn, phone, customerId, passwd)" 
					+ "VALUES (?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql); //Statement보다 속도빠름, 
			stmt.setString(1, "조조");
			stmt.setString(2, "840824-1234567");
			stmt.setString(3, "010-4545-4545");
			stmt.setString(4, "sql");
			stmt.setString(5, "1111");
			stmt.executeUpdate();
			
			System.out.println("INSERTED....");
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
