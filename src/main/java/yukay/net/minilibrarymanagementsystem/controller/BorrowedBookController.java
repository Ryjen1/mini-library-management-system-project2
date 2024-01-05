package yukay.net.minilibrarymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yukay.net.minilibrarymanagementsystem.model.BorrowedBook;
import yukay.net.minilibrarymanagementsystem.service.BorrowedBookService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mini-library")
public class BorrowedBookController {
    @Autowired
    private BorrowedBookService borrowedBookService;
    @PostMapping("post-book")
    public BorrowedBook postBook(@RequestBody BorrowedBook borrowedBook){
        return borrowedBookService.postBook(borrowedBook);
    }
    @DeleteMapping("delete-borrowed-book")
    public void deleteBorrowedBook(@PathVariable Long id){
        borrowedBookService.deleteBorrowedBook(id);
    }
    @GetMapping("/borrowed-book/{id}")
    public Optional<BorrowedBook> searchBorrowedBookById(@PathVariable Long id){
        return borrowedBookService.searchBorrowedBook(id);
    }
    @GetMapping("all-borrowed-books")
    public List<BorrowedBook> allBorrowedBooks(){
        return borrowedBookService.allBorrowedBooks();
    }


}
