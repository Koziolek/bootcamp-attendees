package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by BKuczynski on 2016-12-14.
 */

@Entity
public class Post extends Content {

	@ManyToOne
	@JoinColumn(name = "mainCategory_name")
	private Category mainCategory;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="name_category")
	private Set<Category> categories;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_comment")
    private Set<Comment> comments;
	
	
	
	/// getters & setters

	public Category getMainCategory() {
		return mainCategory;
	}

	public void setMainCategory(Category mainCategory) {
		this.mainCategory = mainCategory;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
}

