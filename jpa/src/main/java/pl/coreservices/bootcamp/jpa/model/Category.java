package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Entity(name = "Category")
@Table(name = "Category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id", updatable = false)
	private long categoryId;

	@Column(name = "name")
	private String name;

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Category parent;

	public long getCategoryId() {

		return categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}
}