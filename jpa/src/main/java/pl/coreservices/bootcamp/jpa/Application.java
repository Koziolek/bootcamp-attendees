package pl.coreservices.bootcamp.jpa;

import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pl.coreservices.bootcamp.jpa.model.Author;
import pl.coreservices.bootcamp.jpa.model.Content;

import javax.persistence.EntityManager;


@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(EntityManager entityManager) {
        return (args) -> {

//            entityManager.getTransaction().begin();
//            Author author = new Author();
//            Set<Content> articles;
//            articles.add(new Content())

//            author.setName("Denis");
//            author.setArticles();

//            entityManager.persist(author); // Zapis

//             tu załaduj dane do bazy

//            entityManager.getTransaction().commit();
        };
    }
}

