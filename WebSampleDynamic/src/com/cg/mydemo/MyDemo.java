package com.cg.mydemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyDemo extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();

		// Tomcat gives the object of servletcontext
		/*
		 * ServletContext ctx = getServletContext(); ctx.getInitParameter("message");
		 * String str = ctx.getInitParameter("message");
		 * 
		 * out.println(str);
		 * 
		 * ctx.getInitParameter("name"); String str1 = ctx.getInitParameter("name");
		 * 
		 * out.println("\n"+str1);
		 */
		
		 ServletConfig cg = getServletConfig();
		 cg.getInitParameter("name");
	     String str= getInitParameter("name");
	     out.println("Name = "+str);
	}
}
