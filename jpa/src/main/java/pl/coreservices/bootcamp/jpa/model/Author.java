package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Entity(name = "Author")
@Table(name = "author")
public class Author {

	@Column(name = "name", unique = true)
	@Id
	private String name;

	@OneToMany(
			mappedBy = "author",
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
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
