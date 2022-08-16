package com.hexaware.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hexaware.businesslogic.Userlogic;
import com.hexaware.model.User;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		String name, email, username, password;
		int mobile;
		
		name = request.getParameter("name");
		email = request.getParameter("email");
		mobile = Integer.parseInt(request.getParameter("mobile"));
		username = request.getParameter("username");
		password = request.getParameter("password");
		
		user.setName(name);
		user.setEmail(email);
		user.setMobile(mobile);
		user.setUsername(username);;
		user.setPassword(password);
		
		try {
			if(Userlogic.register(user)) {
				response.sendRedirect("/DemoMVCProject/home.jsp");
			} else {
				response.sendRedirect("/DemoMVCProject");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
