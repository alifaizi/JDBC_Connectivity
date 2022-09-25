package com.mysqlconnect.fetching.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrievingAllDataFromDatabase {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://tek-instrance-db.mysql.database.azure.com:3306/tek_insurance_app";
		String userName = "tek_student_user";
		String password = "MAY_2022";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, userName, password);

		Statement st = con.createStatement();
		String str = "SELECT * FROM primary_person Where id=243";
		ResultSet rs = st.executeQuery(str);

		while (rs.next()) {
			String id = rs.getString("id");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			String gender = rs.getString("gender");
			String email = rs.getString("email");
			String dob = rs.getString("date_of_birth");
			String employment = rs.getString("employment_status");
			String martialStatus = rs.getString("marital_status");

			System.out.println("ID: " + id + "..." + "First Name: " + firstName + "..." + "Last Name: " + lastName + "..." 
			+ "Gender: " + gender + "..." + "Email " + email + "..." + "Date of Birth: " + dob + "..." 
					+ "Employment Status: " + employment + "..." + "Martial Status: " + martialStatus);
		}
		
		System.out.println("======================================================");
		System.out.println("Total number of records retrieved: " + rs.TYPE_SCROLL_INSENSITIVE);

		st.close();
		con.close();

	}

}
