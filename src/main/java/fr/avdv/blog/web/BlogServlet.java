package fr.avdv.blog.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * une servlet de base
 */
public class BlogServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//	pas utilisé car renvoi une réponse en erreur bon pour dev/debug super.doGet(req, resp);
		//permet de réécrire la réponse renvoyée au client suite à la requête
		final PrintWriter writer = resp.getWriter();
		//corps de la réponse HTTP
		writer.append("<html>");
		writer.append("<body>");
		writer.append("<h1>HELLO WORLD</h1>");
		writer.append("</body>");
		writer.append("</html>");
		writer.flush();//vide le buffer
	}
	
}
