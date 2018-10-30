package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;

/**
 * Created by BKuczynski on 2016-12-15.
 */
@Entity(name = "SignedComment")
@Table(name = "SignedComment")
public class SignedComment extends Comment {

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Author author;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}