package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Entity
@Table(name = "comment")
public class Comment {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private UUID id;

	@Column(name = "postedAt")
	private LocalDateTime postedAt;

	@Column(name = "content")
	private String content;

	@ManyToOne
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

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
}
