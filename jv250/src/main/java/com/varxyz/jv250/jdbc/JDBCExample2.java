package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; //인터넷에서 찾으면 된다 외울것은 아니고
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul"; //어디다가 적어둬라, timezone은 옵션 시스템에 문제가있을까봐?
		String id = "jv250";
		String passwd = "jv250";
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		//driver 생성 자바에서 한다.
		try {
			try {
				Class.forName(driver);
				System.out.println("LOADED DRIVER ---->" + driver);
				
				con = DriverManager.getConnection(url, id, passwd); //drivermanager 는 static 
				System.out.println("CONNECTED TO ----->" + url);
				
				String sql = "SELECT * FROM Customer WHERE name = ?";
				stmt = con.prepareStatement(sql); //Statement보다 속도빠름, 
				rs = stmt.executeQuery();
				stmt.setString(1, "유비");
				while(rs.next()) { //데이터가 없는데까지 돌린다?
					long cid = rs.getLong("cid");
					String customerId = rs.getString("customerId"); //칼럼의 데이터를 가져오겠다.
					String name = rs.getString("name");
					String phone = rs.getString("phone");
					System.out.println(cid);
					System.out.println(customerId);
					System.out.println(name);
					System.out.println(phone);
					System.out.println("-------------------");
				}
			}finally {
				rs.close();
				stmt.close();
				con.close();				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
