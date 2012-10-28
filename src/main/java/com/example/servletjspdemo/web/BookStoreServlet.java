package com.example.servletjspdemo.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.*;

@WebServlet(urlPatterns = "/book")
public class BookStoreServlet extends HttpServlet 
{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

/** This method is the first method executed when the servlet loads.
 * @param HttpServletRequest
 * @param HttpServletResponse
 * @return void
 * @throws ServletException 
 */
 
public synchronized void init (ServletConfig config) throws ServletException

{ 
        super.init();

}               		
	
/** doGet method
 */
		 
public void doGet (HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException 	
{
	// Send out first page:	
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();	

	out.println("<HTML<");
	out.println("<BODY>");
	out.println("<CENTER>");
	out.println("<H1>Welcome to WholeLottaBooks.com!</H1>");
	out.println("Would you like to begin shopping?");
	out.println("<FORM ACTION='/servlet/BookStoreServlet' METHOD='POST'>");
	out.println("<INPUT TYPE='submit' VALUE='You bet!'>");
	out.println("</FORM>");
	out.println("</CENTER>");
	out.println("</BODY>");
	out.println("</HTML>");
	
}

/**
 * doPost method
 */

@SuppressWarnings("deprecation")
public void doPost (HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException 	
{

	
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	ShoppingCart sc;
	HttpSession session = req.getSession(true);
	
	if (session.getValue("Cart") == null)
		// User has no shopping cart, create one.
	{
		sc= new ShoppingCart();
		session.putValue("Cart",sc);
		int acct = new Random().nextInt();
		if (acct < 0)
			acct = acct * -1;
		// Cast to type of ShoppingCart, since HttpSession only deals in Object.
		((ShoppingCart)session.getValue("Cart")).setAccountNum(acct);
	}
		out.println("Your account number is " + ((ShoppingCart)session.getValue("Cart")).getAccountNum());		
	}	
	
	}	//end of servlet