package banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountJdbcTest {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; 
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		
		try {
			Class.forName(driver);
			System.out.println("LOADED DRIVER ---->" + driver);
			
			Connection con = DriverManager.getConnection(url, id, passwd); 
			System.out.println("CONNECTED TO ----->" + url);
			
			select(con);
			insert(con);
			select(con);
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		public static void select(Connection con) {
			String sql = "SELECT * FROM Account";
			try {
				PreparedStatement stmt = con.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					long aid = rs.getLong("aid");
					String accountNum = rs.getString("accountNum");
					long balance = rs.getLong("balance");
					long customerId = rs.getLong("customerId");
					long interestRate  = rs.getLong("interestRate");
					long overdraft  = rs.getLong("overdraft");
					char accountType  = rs.getString("accountType").charAt(0);
					System.out.println(aid);
					System.out.println(accountNum);
					System.out.println(balance);
					System.out.println(interestRate);
					System.out.println(overdraft);
					System.out.println(accountType);
					System.out.println("-------------------");
				}
				rs.close();
				stmt.close();
				System.out.println("SELECT COMPILETED....\n");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void insert(Connection con) {
			String sql = "INSERT INTO Account(accountNum, balance, interestRate,"
					+ "overdraft, accountType, customerId)" 
					+ "VALUES (?,?,?,?,?,?)";
			
			try {
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, "788-65-5855");
				stmt.setDouble(2, 55000.0);
				stmt.setDouble(3, 1.5);
				stmt.setDouble(4, 0.0);
				stmt.setString(5, String.valueOf('S'));
				stmt.setLong(6, 1002);
				
				stmt.executeUpdate();
				stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
