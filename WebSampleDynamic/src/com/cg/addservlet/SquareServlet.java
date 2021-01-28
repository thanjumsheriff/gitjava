package com.cg.addservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		/*
		 * PrintWriter out = res.getWriter(); int i =
		 * Integer.parseInt(req.getParameter("num1")); int j =
		 * Integer.parseInt(req.getParameter("num2")); int k =
		 * Integer.parseInt(req.getParameter("k")); out.println("Square Servlet");
		 * System.out.println("Addition of "+i+" and " +j+" = " + k);
		 */
		HttpSession session1 = req.getSession();
		int k = (int) session1.getAttribute("k");

		HttpSession session2 = req.getSession();
		int i = (int) session2.getAttribute("i");

		HttpSession session3 = req.getSession();
		int j = (int) session3.getAttribute("j");

		PrintWriter out = res.getWriter();
		out.println("The Addition of " + i + " and " + j + " = " + k);

		int x = k * k;
		out.println("The square of " + k + " = " + x);
		
		
	}
}
