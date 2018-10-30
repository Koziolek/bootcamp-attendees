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
 * Created by BKuczynski on 2016-12-15.
 */


@Entity
@Table(name = "Content")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="Type",
    discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("default")
public class Content{
	
	
	private long id;
	
	private Author author;
	
	private LocalDateTime publishedAt;

	private String content;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long getId() {
        return id;
    }
	
	  public void setId(Long id) {
	        this.id = id;
	    }

	
	@OneToOne
	@JoinColumn(name="author") //sprobuj tu dac ze to jest z innej tabeli i zrob to tez w comment
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Column
	public LocalDateTime getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(LocalDateTime publishedAt) {
		this.publishedAt = publishedAt;
	}
	
	@Column
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
