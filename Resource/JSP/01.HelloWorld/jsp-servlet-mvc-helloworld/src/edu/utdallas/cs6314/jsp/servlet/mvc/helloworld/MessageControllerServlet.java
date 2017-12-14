package edu.utdallas.cs6314.jsp.servlet.mvc.helloworld;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MessageControllerServlet
 */
@WebServlet("/MessageControllerServlet")
public class MessageControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get all the parameters required to do message processing
		String message= request.getParameter("message");
		
		/*
		 * Do some complex message processing here! 
		 */
		String updatedMsg = "Old msg......" + "New msg: " + message;
		String user = "John";
		String date = new Date().toString();
		String memberSince = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime().toString();
		int totalPosts = 10;
		
		request.setAttribute("updatedmsg", updatedMsg);
		request.setAttribute("user", user);
		request.setAttribute("date", date);
		request.setAttribute("membersince", memberSince);
		request.setAttribute("totalposts", totalPosts);
		
		request.getRequestDispatcher("/displaymsg.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
