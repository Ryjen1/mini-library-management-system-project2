package yukay.net.minilibrarymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yukay.net.minilibrarymanagementsystem.model.Book;
import yukay.net.minilibrarymanagementsystem.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/mini-library")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping("/add-book")
    public String addBook(@RequestBody Book book){
        Book addBook = bookService.addBook(book);
        return "Book added successfully";
    }
    @DeleteMapping("/delete-book/{isbn}")
    public void deleteBookByIsbn(@PathVariable  String isbn){

        bookService.deleteBookByIsbn(isbn);
    }
    @GetMapping("/search/{title}")
    public Book getBook(@PathVariable String title){

        return bookService.getBook(title);
    }
    @GetMapping("/allBooks")
    public List<Book> getAllBooks(){

        return bookService.getAllBooks();
    }

}
