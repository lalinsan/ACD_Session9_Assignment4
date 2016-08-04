/*
* Student: Eduardo Aguirre
* Session 9
* Assignment 
* Servlet that applies Filtering.
* 
*/

package com.acadgild.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private final String userName="Eduardo";
	@SuppressWarnings("unused")
	private final String password="Lion";

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get the User Credentials Parameters and store them in the variable userName and Password 
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		//Credentials Validation
		if(userName.equals("Eduardo") || password.equals("Lion"))
		{
			HttpSession session=request.getSession(true);
			session.setAttribute("id", session.getId());
			session.setAttribute("userName", userName);
			session.setAttribute("password", password);
			//Set Cookies
			Cookie user = new Cookie ("userName", request.getParameter(userName));
			response.addCookie(user);
			
			Cookie pass = new Cookie ("password", request.getParameter(password));
			response.addCookie(pass);
			
			//Redirects to LoginSuccessfully.jsp Page when the credentials match Eduardo and Lion
			response.sendRedirect("LoginSuccessfully.jsp");
		}
		
		else
		{
			//Dispatch Login.jsp when the credentials do not match Eduardo and Lion
			RequestDispatcher reqDis = getServletContext().getRequestDispatcher("/Login.jsp");
			//Displays Message in red color when the credentials are invalid
			out.println ("<font color=F5220A><b> Invalid credentials, try again !</b></font>");
			reqDis.include(request,response);
		}
		
		
	}

}