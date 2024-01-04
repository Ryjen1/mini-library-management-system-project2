package yukay.net.minilibrarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yukay.net.minilibrarymanagementsystem.model.Book;

@Repository
public interface BookRepository extends JpaRepository <Book,Long>{
    void deleteByIsbn(String isbn);
    Book findByTitle(String title);
}
