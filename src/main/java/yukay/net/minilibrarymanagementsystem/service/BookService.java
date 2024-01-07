package yukay.net.minilibrarymanagementsystem.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import yukay.net.minilibrarymanagementsystem.entity.Book;
import yukay.net.minilibrarymanagementsystem.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
    public Book addBook;
    public String deleteBookByIsbn;
    public Book getBook;
    public List<Book> getAllBooks;
    @Autowired
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book){
       return bookRepository.save(book);
    }
    @Transactional
    @CacheEvict(value = "books", key ="#isbn")
    public void deleteBookByIsbn(String isbn){
        bookRepository.deleteByIsbn(isbn);

    }

    @Cacheable(value = "bookCache", key = "#title")
    public Book getBook(String title){
        return bookRepository.findByTitle(title);
    }
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }


}
