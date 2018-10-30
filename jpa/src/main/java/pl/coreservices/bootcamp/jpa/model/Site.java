package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Created by BKuczynski on 2016-12-15.
 */
@Entity
public class Site extends Content {

	@OneToOne
	@JoinColumn(nullable = false, name = "site_parent_id")
	private Site parent;

	public Site getParent() {
		return parent;
	}

	public void setParent(Site parent) {
		this.parent = parent;
	}
}
