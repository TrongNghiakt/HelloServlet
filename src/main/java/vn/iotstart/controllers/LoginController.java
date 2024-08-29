package vn.iotstart.controllers;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4637959602814523206L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);

		String site = new String("view/login.jsp");
		RequestDispatcher rd = req.getRequestDispatcher(site);
		rd.include(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String name = req.getParameter("uname");
		String pass = req.getParameter("psw");

		req.setAttribute("username", name);
		req.setAttribute("password", pass);

		RequestDispatcher rd = req.getRequestDispatcher("view/home.jsp");
		rd.forward(req, resp);
	}
}
