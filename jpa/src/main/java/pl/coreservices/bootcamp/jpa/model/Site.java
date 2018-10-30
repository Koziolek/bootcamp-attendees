package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by BKuczynski on 2016-12-15.
 */

@DiscriminatorValue("site")
@Entity
public class Site extends Content {
	
	
	private Site parent;
	
	@ManyToOne
	public Site getParent() {
		return parent;
	}

	public void setParent(Site parent) {
		this.parent = parent;
	}
}
