package pl.coreservices.bootcamp.jpa.model;

import java.util.Set;

/**
 * Created by BKuczynski on 2016-12-14.
 */
public class Author {

	private String name;

	private Set<Content> articles;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getArticles() {
		return articles;
	}

	public void setArticles(Set<Content> articles) {
		this.articles = articles;
	}
}
