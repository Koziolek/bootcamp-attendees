package pl.coreservices.bootcamp.jpa.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Entity
@Table(name = "AUTHOR")
public class Author {
	
	@Id
	private String name;
	
	@ManyToMany
	@JoinColumn(name="author")
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
