package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;

/**
 * Created by BKuczynski on 2016-12-15.
 */
@Entity(name = "Site")
@Table(name = "Site")
public class Site extends Content {

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Site parent;

	public Site getParent() {
		return parent;
	}

	public void setParent(Site parent) {
		this.parent = parent;
	}
}