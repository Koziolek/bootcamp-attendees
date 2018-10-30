package pl.coreservices.bootcamp.jpa.model;

import java.time.LocalDateTime;

/**
 * Created by BKuczynski on 2016-12-14.
 */
public class Comment {

	private LocalDateTime postedAt;

	private String content;

	private Post post;

	public LocalDateTime getPostedAt() {
		return postedAt;
	}

	public void setPostedAt(LocalDateTime postedAt) {
		this.postedAt = postedAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
}
