package com.regApp.model;

import java.sql.ResultSet;

public interface DAOService {
	public void connectDB();
	public boolean verifyCredentials(String email, String password);
	public void saveRegistration(String name, String city, String email, String mobile);
	public ResultSet listAllregistration();
	public void DeleteReg(String email);
	public void UpdateReg(String email, String mobile);
}
