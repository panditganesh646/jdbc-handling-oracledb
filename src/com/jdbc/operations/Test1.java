package com.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Test1 {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ganesh","ganesh");
	    if(con!=null) {
	    	System.out.println("Connection established Successfully..!");
	    }
	    else {
	    	 System.out.println("Connection not established..!");
	    }
 }
}
