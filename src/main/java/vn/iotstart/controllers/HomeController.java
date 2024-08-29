package vn.iotstart.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HomeController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2475285465227217156L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		resp.setContentType("html/text");
		String ten1 = req.getParameter("ten");
		String ho1 = req.getParameter("ho");

		PrintWriter printW = resp.getWriter();
		printW.println(ho1 + " " + ten1);
		printW.close();

		RequestDispatcher rd = req.getRequestDispatcher("view/home.jsp");
		rd.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		doGet(req, resp);
	}
}
