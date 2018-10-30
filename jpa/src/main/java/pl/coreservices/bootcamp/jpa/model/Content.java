package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by BKuczynski on 2016-12-15.
 */
@Entity
@Table(name = "content")
public class Content {
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private UUID id;

	@ManyToOne
	@JoinColumn(name = "author_name")
	private Author author;

	@Column(name = "publishedAt")
	private LocalDateTime publishedAt;

	@Column(name = "content")
	@Basic
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

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
}



