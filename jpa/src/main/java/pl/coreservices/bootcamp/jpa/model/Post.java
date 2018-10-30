package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Entity
@Table(name = "post")
public class Post extends Content {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private UUID id;

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private Category mainCategory;

	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
	private Set<Category> categories;

	@OneToMany(
			mappedBy = "post",
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
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

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
}
