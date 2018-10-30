package pl.coreservices.bootcamp.jpa.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Entity
@Table(name = "Comment")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="Type",
    discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("default")
public class Comment {
	
	
	private LocalDateTime postedAt;
	
	private Long id;

	
	private String content;
	
	
	private Post post;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }
	
	 public void setId(Long id) {
	        this.id = id;
	    }
	
	@Column(updatable = false,nullable = false)
	public LocalDateTime getPostedAt() {
		return postedAt;
	}

	public void setPostedAt(LocalDateTime postedAt) {
		this.postedAt = postedAt;
	}
	
	@Column
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	@OneToOne
	@JoinColumn(name="id")
	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
}
