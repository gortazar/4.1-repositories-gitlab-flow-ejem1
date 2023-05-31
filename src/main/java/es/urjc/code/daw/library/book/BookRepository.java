package es.urjc.code.daw.library.book;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    Collection<Book> findByTitle(String title);

}