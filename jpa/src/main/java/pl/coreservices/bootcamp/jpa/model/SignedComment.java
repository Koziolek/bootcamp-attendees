package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Created by BKuczynski on 2016-12-15.
 */

@Entity
@DiscriminatorValue("signed")
public class SignedComment extends Comment {

	private Author author;
	
	@OneToOne
	@JoinColumn(name = "name")
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}
