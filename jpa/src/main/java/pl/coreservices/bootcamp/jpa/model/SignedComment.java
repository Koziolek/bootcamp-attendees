package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;

/**
 * Created by BKuczynski on 2016-12-15.
 */
@Entity
@DiscriminatorValue("Signed")
public class SignedComment extends Comment {

	@ManyToOne
	@JoinTable(name="author_signed_comment",
			joinColumns=@JoinColumn(name="comment_id"),
			inverseJoinColumns=@JoinColumn(name="author_id"))
	private Author author;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}
