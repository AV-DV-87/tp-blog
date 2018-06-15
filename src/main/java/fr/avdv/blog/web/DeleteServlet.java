package fr.avdv.blog.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.avdv.blog.business.ArticleService;

public class DeleteServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//récupère l'id passé dans l'url et stocke le
		//ATTENTION le get parameter recupere l'id en String
		final String strId = req.getParameter("id");
		//utilise la méthode de la couche service
		//On parse l'id pour obtenir un integer
		ArticleService.getSingleton().delete(Integer.parseInt(strId));
		//une fois supprimé revient sur la liste des articles
		resp.sendRedirect(
				this.getServletContext().getContextPath()+"/articles"
				);
		
	}	
	
}
