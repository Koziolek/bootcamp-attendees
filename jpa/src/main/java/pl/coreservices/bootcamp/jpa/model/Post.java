package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Entity(name = "Post")
@Table(name = "Post")
public class Post extends Content {


	@ManyToOne
	private Category mainCategory;

	@Column(name = "Category")
	@ManyToMany(
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	@JoinTable(
			joinColumns = @JoinColumn(name = "post_column",
					referencedColumnName = "id" ),
			inverseJoinColumns = @JoinColumn(name = "category_column",
					referencedColumnName = "name")
	)
	private Set<Category> categories;

	@OneToMany(mappedBy = "post",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
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