package yukay.net.minilibrarymanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import yukay.net.minilibrarymanagementsystem.entity.BorrowedBook;
import yukay.net.minilibrarymanagementsystem.repository.BorrowedBookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BorrowedBookService {
    @Autowired
    private BorrowedBookRepository bookRepository;

    public BorrowedBook postBook(BorrowedBook borrowedBook) {
        return bookRepository.save(borrowedBook);
    }

    @CacheEvict(value = "borrowedBooks", key = "#id")
    public void deleteBorrowedBook(Long id) {
        bookRepository.deleteById(id);
    }
    @Cacheable(value = "borrowedBooks", key = "#id")
    public Optional<BorrowedBook> searchBorrowedBook(Long id) {
        return bookRepository.findById(id);
    }
    public List<BorrowedBook> allBorrowedBooks() {
        return bookRepository.findAll();
    }

}
