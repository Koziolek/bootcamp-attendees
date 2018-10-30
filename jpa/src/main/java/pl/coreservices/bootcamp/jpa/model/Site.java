package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;

/**
 * Created by BKuczynski on 2016-12-15.
 */

@Entity
public class Site extends Content {

    @ManyToOne
    @JoinColumn(name = "parent_id")
	private Site parent;
	
	
	
	/// getters & setters

	public Site getParent() {
		return parent;
	}

	public void setParent(Site parent) {
		this.parent = parent;
	}
}

