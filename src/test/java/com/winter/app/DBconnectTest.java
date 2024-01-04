package com.winter.app;

import static org.junit.Assert.*;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DBconnectTest extends MyTest {

	@Autowired
	private DataSource dataSource;

	
	@Test   // 단정문(멤버변수)를 사용하기위해 선언
	public void connectTest() throws Exception {
		Connection con = dataSource.getConnection();
		
		// 단정문  => null = false
		assertNotNull(con);
	}

}
