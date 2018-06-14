package fr.avdv.blog.web;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.avdv.blog.domain.Article;

public class IndexServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final List<Article> articles = Collections.unmodifiableList(Arrays.asList(new Article[] {
		new Article(0, "Article 1 bienvenue", "fiozejfiojzoefjzeiofjzeiofjzeojgjpoz"),	
		new Article(1, "Article 2", "fiozejfiojzoefjzeiofjzeiofjzeojgjpoz"),	
		new Article(3, "Article 3", "fiozejfiojzoefjzeiofjzejytjytjgyhyghgyj")	
	}));
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//défini les attribut de la requête HTTP GET
		request.setAttribute("listArticle", IndexServlet.articles);
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
		
	}

}
