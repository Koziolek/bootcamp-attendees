package pl.coreservices.bootcamp.jpa.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Created by BKuczynski on 2016-12-14.
 */

@Entity
public class Post extends Content {
	
	
	private Category mainCategory;
	
	private Set<Category> categories;

	private Set<Comment> comments;
	
	@OneToOne
	@JoinColumn(name = "name")
	public Category getMainCategory() {
		return mainCategory;
	}

	public void setMainCategory(Category mainCategory) {
		this.mainCategory = mainCategory;
	}
	
	@OneToMany
	@JoinColumn(name = "name")
	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	@OneToMany
	@JoinColumn(name = "id")
	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
}
