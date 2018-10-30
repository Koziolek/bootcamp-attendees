package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Entity
@Table(name = "CATEGORY")
public class Category {
	
	
	
	private String name;
	
	
	private Category parent;
	
	@Id
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@OneToOne(cascade = CascadeType.DETACH)
    @PrimaryKeyJoinColumn
	public Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}
}
