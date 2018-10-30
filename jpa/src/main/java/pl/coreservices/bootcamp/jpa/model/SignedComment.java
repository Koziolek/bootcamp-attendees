package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;

/**
 * Created by BKuczynski on 2016-12-15.
 */
@Entity
public class SignedComment extends Comment {

	@ManyToOne
	@JoinColumn(nullable = false, name = "author_id")
	private Author author;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}
