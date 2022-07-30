package com.raje;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqrServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		//int k = Integer.parseInt(req.getParameter("k"));
		
		HttpSession session =req.getSession();
		
		//session.removeAttribute("k");
		
		
		int k = (int) session.getAttribute("k");

		k = k * k;
		PrintWriter out = res.getWriter();
		out.println("result of squre is :" + k);

		System.out.println("sq called");

	}
}