package pl.coreservices.bootcamp.jpa.model;

import java.time.LocalDateTime;

/**
 * Created by BKuczynski on 2016-12-15.
 */
public class Content {

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
