package com.dell.tms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class TDBUtil {

	public static Connection getConnection() {
		Connection con=null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		 con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","mani","mani"); 
		
		return con;
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
}
}
