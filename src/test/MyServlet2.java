package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class MyServlet2 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// we geven aan wat de inhoud van het resultaat zal zijn
			resp.setContentType("text/html");

			// We halen het object op om onze output naar de response stream te
			// schrijven
			PrintWriter out = resp.getWriter();

			out.print("<!DOCTYPE HTML>" + "<HTML><HEAD><TITLE>Stijn</TITLE></HEAD>" + "<BODY>" + "<H1>TEST</H1>"
					+ "<P>Stijn's SERVLET FOR TESTING.</P>" + "</BODY></HTML>");
}
}
