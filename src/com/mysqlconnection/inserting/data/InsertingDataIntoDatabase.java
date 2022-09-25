package com.mysqlconnection.inserting.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertingDataIntoDatabase {
	
public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://tek-instrance-db.mysql.database.azure.com:3306/tek_insurance_app";
		String userName = "tek_student_user";
		String password = "MAY_2022";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		Statement st = con.createStatement();
		
		String str = "INSERT INTO PRIMARY_PERSON VALUES(9090,'joe@bigman.com')";
		
		st.execute(str);
		
		
		st.close();
		con.close();
		
		System.out.println("Quesry Executed.....");
		
	}
	

}
