package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by BKuczynski on 2016-12-15.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Content {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	private Author author;

	private LocalDateTime publishedAt;

	private String content;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public LocalDateTime getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(LocalDateTime publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
