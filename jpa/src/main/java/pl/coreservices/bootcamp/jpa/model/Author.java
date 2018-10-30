package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Entity(name = "Author")
@Table(name = "Author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    private long authorID;

    @Column(name = "name")
    private String name;

    @OneToMany(
            mappedBy = "author",
            cascade = CascadeType.ALL)
    private Set<Content> articles;


    public long getAuthorID() {
        return authorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getArticles() {
        return articles;
    }

    public void setArticles(Set<Content> articles) {
        this.articles = articles;
    }
}