package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	@OneToOne
	@JoinColumn(nullable = false, name = "category_parent_id")
	private Category parent;

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
