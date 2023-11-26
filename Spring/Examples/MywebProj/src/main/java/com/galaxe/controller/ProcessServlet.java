package com.galaxe.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ProcessServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);
		
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		
		req.setAttribute("phone", phone);
		req.setAttribute("name", name);
		req.setAttribute("email", email);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("Output.jsp");
		dispatcher.forward(req, resp);
		//return;
	}

	
}
