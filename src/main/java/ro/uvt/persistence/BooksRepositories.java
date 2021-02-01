package ro.uvt.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import ro.uvt.models.Carte;

import java.util.List;

//@EnableJpaRepositories(basePackages="ro.uvt", entityManagerFactoryRef="em")
@Repository
public interface BooksRepositories extends JpaRepository<Carte, Integer>{

}