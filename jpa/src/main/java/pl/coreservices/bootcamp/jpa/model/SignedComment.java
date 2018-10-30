package pl.coreservices.bootcamp.jpa.model;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.UUID;

/**
 * Created by BKuczynski on 2016-12-15.
 */
@Entity
@Table(name = "signedComment")
public class SignedComment extends Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@ManyToOne
	private Author author;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public UUID getId() {
		return id;
	}

	@Override
	public void setId(UUID id) {
		this.id = id;
	}
}
