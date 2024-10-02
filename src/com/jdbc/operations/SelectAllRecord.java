package com.jdbc.operations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SelectAllRecord {
   public static void main(String[] args)throws ClassNotFoundException,SQLException {
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ganesh","ganesh");
	  Statement st= con.createStatement();
	  ResultSet rs = st.executeQuery("SELECT *FROM STUDENT");
	  System.out.println("SID\tSNAME");
	  System.out.println("==============");
	  while(rs.next()) {
		   System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
	  }
	  con.close();  
}
}
