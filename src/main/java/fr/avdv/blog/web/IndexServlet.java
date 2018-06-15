package fr.avdv.blog.web;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.avdv.blog.business.ArticleService;
import fr.avdv.blog.domain.Article;

public class IndexServlet extends HttpServlet {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//défini les attribut de la requête HTTP GET
		// déplacé sur init request.setAttribute("listArticle", IndexServlet.articles);
		
		//utilisation de la session pour stockage temporaire des articles
		request.getSession(true).setAttribute("listArticle", ArticleService.getSingleton().getArticles());;
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
		
	}
	
	@Override
	public void init() throws ServletException {
		// inutile car vide dans HttpServlet
		//-> super.init();
		final int idCount = Integer.parseInt(this.getInitParameter("idCount"));
		ArticleService.prepareSingleton(idCount);
		
	}
	
	

}
