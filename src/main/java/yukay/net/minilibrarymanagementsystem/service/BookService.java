package yukay.net.minilibrarymanagementsystem.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import yukay.net.minilibrarymanagementsystem.model.Book;
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
    public void deleteBookByIsbn(String isbn){
        bookRepository.deleteByIsbn(isbn);

    }

    public Book getBook(String title){
        return bookRepository.findByTitle(title);
    }
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }


}
