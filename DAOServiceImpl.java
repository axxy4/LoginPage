package com.regApp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class DAOServiceImpl implements DAOService {

	Connection con;
	Statement stmnt;

	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationApp", "root", "Akshay@123");
			stmnt = con.createStatement();
		} catch (Exception e) {
		}
	}

	@Override
	public boolean verifyCredentials(String email, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ResultSet result = stmnt.executeQuery("Select * from login where email='" + email + "' and password='" + password + "'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void saveRegistration(String name, String city, String email, String mobile) {
		try {
			stmnt.executeUpdate("insert into registration values('" + name + "','" + city + "','" + email + "','" + mobile + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet listAllregistration() {
		try {
			ResultSet result = stmnt.executeQuery("Select * from registration");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void DeleteReg(String email) {
		try {
			stmnt.executeUpdate("Delete from registration where email='"+email+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void UpdateReg(String email, String mobile) {
		try {
			stmnt.executeUpdate("UPDATE registration SET mobile='"+mobile +"' WHERE email='"+email+"'");
		} catch (Exception e) {
		}
	}

}