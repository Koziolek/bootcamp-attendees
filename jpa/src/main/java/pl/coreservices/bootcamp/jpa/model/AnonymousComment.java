package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by BKuczynski on 2016-12-15.
 */
@Entity(name = "AnonymousComment")
@Table(name = "AnonymousComment")
public class AnonymousComment extends Comment {

    @Column(name = "author_name")
    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


}