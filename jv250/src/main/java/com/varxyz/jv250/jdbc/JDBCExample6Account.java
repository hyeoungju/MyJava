package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample6Account {
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
			
			String sql = "SELECT * FROM Account";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) { //데이터가 없는데까지 돌린다?
				long aid = rs.getLong("aid");
				String customerId = rs.getString("customerId"); //칼럼의 데이터를 가져오겠다.
				String accountNum = rs.getString("accountNum");
				long balance = rs.getLong("balance");
				long interestRate  = rs.getLong("interestRate");
				long overdraft  = rs.getLong("overdraft");
				String accountType  = rs.getString("accountType");
				System.out.println(aid);
				System.out.println(customerId);
				System.out.println(accountNum);
				System.out.println(balance);
				System.out.println(interestRate);
				System.out.println(overdraft);
				System.out.println(accountType);
				System.out.println("-------------------");
			}
			rs.close();
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
