package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	
	protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
			
			resp.setContentType("text/html");
			try(PrintWriter out = resp.getWriter()){
			
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<title> Servlet S1 </title>");
				out.println("</head>");
				out.println("<body>");
				
				String name = req.getParameter("user_name");
				String password = req.getParameter("user_password");
				String email = req.getParameter("user_email");
				
				out.println(name+" "+password+" "+email);
				
				
					
			
				
				
				out.println("</body>");
				out.println("</html>");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException{
			processRequest(req, res);
		}
		
		protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException{
			processRequest(req, res);
			
		}


}
