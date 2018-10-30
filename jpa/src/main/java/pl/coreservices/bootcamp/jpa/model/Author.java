package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by BKuczynski on 2016-12-14.
 */

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;

	@OneToMany(mappedBy = "author", fetch=FetchType.EAGER)
	private Set<Content> articles;
	
	
	
	/// getters & setters

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