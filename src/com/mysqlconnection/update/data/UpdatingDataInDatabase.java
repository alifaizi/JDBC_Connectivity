package com.mysqlconnection.update.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdatingDataInDatabase {

public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://tek-instrance-db.mysql.database.azure.com:3306/tek_insurance_app";
		String userName = "tek_student_user";
		String password = "MAY_2022";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		Statement st = con.createStatement();
	
		String str = "UPDATE PRIMARY_PERSON SET  first_name = 'Jan' WHERE id = 805";
		
		st.execute(str);
		
		st.close();
		con.close();
		
		System.out.println("Quesry Executed.....");
		
	}

}
