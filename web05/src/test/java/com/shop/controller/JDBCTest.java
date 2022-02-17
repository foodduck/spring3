package com.shop.controller;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class JDBCTest {
	@Autowired
	private final static String DRIVER ="oracle.jdbc.driver.OracleDriver";
	private final static String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	private final static String USER ="root";
	private final static String PW ="1234";
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
