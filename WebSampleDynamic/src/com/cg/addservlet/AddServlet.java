package com.cg.addservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;

		HttpSession session1 = req.getSession();
		session1.setAttribute("k", k);

		HttpSession session2 = req.getSession();
		session2.setAttribute("i", i);

		HttpSession session3 = req.getSession();
		session3.setAttribute("j", j);

		res.sendRedirect("square?k=" + k);
		// System.out.println("Result = " + k);
		/*
		 * PrintWriter out = res.getWriter();
		 * 
		 * out.println("the result is " + k); RequestDispatcher
		 * rd=req.getRequestDispatcher("Square"); rd.forward(req, res);
		 * 
		 * res.sendRedirect("Square?k=" + k);
		 */
	}
}