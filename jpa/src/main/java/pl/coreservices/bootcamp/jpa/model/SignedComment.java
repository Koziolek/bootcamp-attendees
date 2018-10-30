package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;

/**
 * Created by BKuczynski on 2016-12-15.
 */
@Entity
public class SignedComment extends Comment {


    @ManyToOne
    @JoinColumn(name = "author_name")
	private Author author;
	
	
	
	/// getters & setters

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}
