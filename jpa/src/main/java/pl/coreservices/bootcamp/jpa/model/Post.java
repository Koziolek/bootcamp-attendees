package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Entity
public class Post extends Content {
	@ManyToOne
	@JoinColumn(nullable = false, name = "main_category_id")
	private Category mainCategory;

	@ManyToMany
	@JoinTable(name="post_category",
			joinColumns = @JoinColumn(nullable = false, name = "post_id"),
			inverseJoinColumns = @JoinColumn(nullable = false, name = "category_id"))
	private Set<Category> categories;

	@OneToMany(mappedBy = "post")
	private Set<Comment> comments;

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
