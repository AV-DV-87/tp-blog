package fr.avdv.blog.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.avdv.blog.business.ArticleService;

public class ArticleServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/article.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//récupération du contenu des post soumis en POST grâce à leur attribut NAME		
		final String title = req.getParameter("title");
		final String description = req.getParameter("description");
		ArticleService.getSingleton().create(title, description);
		//utilisation de la réponse pour une redirection vers la liste des articles
		resp.sendRedirect(this.getServletContext().getContextPath() + "/articles");
	}

}
