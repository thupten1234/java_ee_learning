package com.example.myweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.HelloBean;
import com.example.LocalHelloBean;


@WebServlet(urlPatterns = { "/" })
public class WebServletClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private HelloBean helloBean;
	@EJB
	private LocalHelloBean localHelloBean;

	@Override

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		try (PrintWriter writer = resp.getWriter()) {
			writer.println("<html>");
			writer.println("<head>");
			writer.println("<title>Hello</title>");
			writer.println("</head>");
			writer.println("<body>");
			writer.println("<p>Web module text</p>");
			writer.println("<p>" + helloBean.getMessageFor("Mr remotebean")+ "</p>");
			writer.println("<p>" + localHelloBean.localMessage("Mr localbean")+ "</p>");			
			writer.println("</body>");
			writer.println("</html>");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
