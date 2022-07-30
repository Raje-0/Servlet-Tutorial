package com.raje;

import java.io.IOException;
import java.io.PrintWriter;

import javax.tools.DocumentationTool.Location;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;

		HttpSession session =req.getSession();
		session.setAttribute("k",k);
		
		// res.sendRedirect("sq?k="+k); //session mamangement,url rewritting
		res.sendRedirect("sq"); // session mamangement,url rewritting

		// req.setAttribute("k",k);
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, res);

	}
}
