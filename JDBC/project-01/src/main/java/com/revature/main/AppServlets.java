package com.revature.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.revature.pojos.User;
import com.revature.service.UserService;

//make accessible at endpoint http
public class AppServlet extends HttpServlet{
	
	private static Logger log = Logger.getLogger(MyHTTPServlet.class);
	static UserService service = new UserService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		log.info("in HTTP Servlet --GET");
		
		PrintWriter writer = resp.getWriter();
		writer.write("GET METHOD RESPONSE");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		log.info("in HTTP Servlet --POST");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		User user = service.getByUsername(username);
		
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		
		String output = "";
		if(user == null) {
			//no user exists
			output = "<b>Incorrect user credentials. Please go back!</b>";
			
		}else {
			//user exists. must check password
			if(password.equals(user.getPassword())) {
				//user has logged in successfully. here is where we would user to session
				output = "<h1>Welcome, " + user.getUsername() + "!</h1> <br> " + user.getBio();
			}else {
				//unsuccessfull log in with wrong password
				output = "<b>Incorrect user credentials. Please go back!</b>";
				
			}
		}
		writer.write(output);
				
	}
	
}
