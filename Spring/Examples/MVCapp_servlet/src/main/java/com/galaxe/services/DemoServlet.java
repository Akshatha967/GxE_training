
package com.galaxe.services;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*; 
public class DemoServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res)  throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		pw.println("<html><body>");  
		pw.println("Welcome to servlet");  
		pw.println("</body></html>");  
		  
		pw.close();//closing the stream  
		}
}  
