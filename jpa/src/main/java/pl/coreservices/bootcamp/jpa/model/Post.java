package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Entity
public class Post extends Content {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToOne
	private Category mainCategory;

	@ManyToMany
	@JoinTable(name="category_post",
			joinColumns=@JoinColumn(name="post_id"),
			inverseJoinColumns=@JoinColumn(name="category_id"))
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
