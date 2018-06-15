package fr.avdv.blog.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import fr.avdv.blog.domain.Article;

public class ArticleService {

	// début Singleton

	private static ArticleService INSTANCE;

	public static ArticleService getSingleton() {
		return ArticleService.INSTANCE;
	}
	
	public static void prepareSingleton(int idCount) throws UnsupportedOperationException {
		if(ArticleService.INSTANCE == null) {
			
			ArticleService.INSTANCE = new ArticleService(idCount);
				
			}else {
				throw new UnsupportedOperationException();
			}
		}

	// fin du Singleton

	private static final List<Article> mock_articles = Collections.unmodifiableList(
			Arrays.asList(new Article[] { new Article(0, "Article 1 bienvenue", "fiozejfiojzoefjzeiofjzeiofjzeojgjpoz"),
					new Article(1, "Article 2", "fiozejfiojzoefjzeiofjzeiofjzeojgjpoz"),
					new Article(2, "Article 3", "fiozejfiojzoefjzeiofjzejytjytjgyhyghgyj") }));

	private int idCount;

	// final pour garder la liste des articles dispo à la même adresse
	private final List<Article> articles;

	public ArticleService(int idCount) {
		this.idCount = idCount;
		this.articles = new ArrayList<>();
		this.articles.addAll(ArticleService.mock_articles);
	}

	public Article create(final String title, final String description) {
		final Article result = new Article();
		// post incrémentation on recup la valeur et on l'incrémente
		// simulation d'une auto incrémentation
		result.setId(this.idCount++);
		result.setTitle(title);
		result.setDescription(description);
		this.articles.add(result);
		return result;
	};

	/**
	 * Permet de récupérer la liste des articles
	 * 
	 * @return the articles
	 */
	public List<Article> getArticles() {
		return articles;
	}
	
	public void delete(int id) {
		//déclaration d'une variable null pouvant contenant l'article recherché
		Article toDelete = null;
		//boucle pour rechercher l'article ayant cet id
		for(Article a : this.articles) {
			//si tu trouves un article avec cet id stocke le dans todelete
			if(a.getId().equals(id)) {
				toDelete = a;
				break;
			}
		}
		//si après recherche todelete n'est pas null supprime le
		if(toDelete != null) {
			this.articles.remove(toDelete);
		}
	}

}
