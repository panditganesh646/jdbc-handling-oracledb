package com.jdbc.operations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateTable {
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
	       String driver = "oracle.jdbc.driver.OracleDriver";
	       String jdbc_url = "jdbc:oracle:thin:@localhost:1521:orcl";
	       String user = "ganesh";
	       String pwd = "ganesh";
	       String sql_query = "create table test3(sname varchar2(10))";
	       Class.forName(driver);
	       Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	       Statement st=  con.createStatement();
	       st.executeUpdate(sql_query);
	       System.out.println("Table Created Successfully..");
	       con.close();
}
}
