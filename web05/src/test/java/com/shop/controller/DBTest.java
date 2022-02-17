package com.shop.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.junit.Test;

import com.mysql.cj.protocol.Resultset;

public class DBTest {

	private final static String DRIVER = "com.mysql.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost:3306/project5?serverTimezone=UTC";
	private final static String USER = "root";
	private final static String PW = "1234";
	String sql;
	Resultset rs = null;
	Connection conn = null; 
	PreparedStatement pstmt = null;
	Statement stmt = null;
	String userid="admin";
	
	@Test
	public void testConnection() throws Exception {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PW);
			//sql = "select * from member where userid=?";
			//pstmt = conn.prepareStatement(sql);
			//pstmt.setString(1, userid);
			//rs = pstmt.executeQuery();
			System.out.println("DB가 제대로 연결되어졌습니다.");
			//rs.close();
			pstmt.close();
			conn.close();
		} catch(Exception e) {
			System.out.println("DB 연결이 실패되었습니다.");
			e.printStackTrace();
		}
	}

}
