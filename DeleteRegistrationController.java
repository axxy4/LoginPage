package com.regApp.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.regApp.model.DAOService;
import com.regApp.model.DAOServiceImpl;

@WebServlet("/delete")
public class DeleteRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteRegistrationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("emailId");
	
	DAOService service = new DAOServiceImpl();
	service.connectDB();
	
	service.DeleteReg(email);
	
	ResultSet result = service.listAllregistration();
	
	request.setAttribute("result", result);
	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/List_registration.jsp");
	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
