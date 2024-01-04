package yukay.net.minilibrarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yukay.net.minilibrarymanagementsystem.model.BorrowedBook;

public interface BorrowedBookRepository extends JpaRepository<BorrowedBook,Long> {
}
