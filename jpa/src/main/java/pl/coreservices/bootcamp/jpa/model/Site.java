package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by BKuczynski on 2016-12-15.
 */

@DiscriminatorValue("site")
public class Site extends Content {
	
	
	private Site parent;
	
	@OneToOne(cascade = CascadeType.DETACH)
    @PrimaryKeyJoinColumn
	public Site getParent() {
		return parent;
	}

	public void setParent(Site parent) {
		this.parent = parent;
	}
}
