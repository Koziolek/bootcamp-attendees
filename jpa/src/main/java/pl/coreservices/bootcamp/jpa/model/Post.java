package pl.coreservices.bootcamp.jpa.model;

import java.util.Set;

/**
 * Created by BKuczynski on 2016-12-14.
 */
public class Post extends Content {

	private Category mainCategory;

	private Set<Category> categories;

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
