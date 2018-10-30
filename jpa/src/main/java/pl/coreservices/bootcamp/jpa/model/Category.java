package pl.coreservices.bootcamp.jpa.model;

/**
 * Created by BKuczynski on 2016-12-14.
 */
public class Category {

	private String name;

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
