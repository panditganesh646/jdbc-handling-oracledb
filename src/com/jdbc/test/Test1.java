package com.jdbc.test;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test1 {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ganesh","ganesh");
	    Statement st = con.createStatement();
	    st.executeUpdate("INSERT INTO STUDENT(SID,SNAME)VALUES(45,'GANESH')");
	    System.out.println("Record Inserted Successfully..!");
	    con.close();
 }
}
