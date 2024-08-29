package vn.iotstart.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/home", "/trangchu" })
public class HelloServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -93464424264624513L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);

		String ten = req.getParameter("ten");
		String ho = req.getParameter("ho");

		PrintWriter out = resp.getWriter();
		out.println("<b>First name:</b> " + ten + "<br><b>Last name:</b>" + ho);
		RequestDispatcher rd = req.getRequestDispatcher("view/index.html");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		// Nhận dữ liệu từ request URL
		String ten = req.getParameter("ten");
		String holot = req.getParameter("holot");
		// Hiển thị dữ liệu ra web bằng đối tượng PrintWriter
		PrintWriter out = resp.getWriter();
		out.println("<b>First Name</b>: " + ten + "<br/><b>Last Name</b>: " + holot);
	}
}
