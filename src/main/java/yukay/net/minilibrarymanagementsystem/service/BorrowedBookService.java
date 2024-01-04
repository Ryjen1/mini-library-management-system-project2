package yukay.net.minilibrarymanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yukay.net.minilibrarymanagementsystem.repository.BorrowedBookRepository;

@Service
public class BorrowedBookService {
    @Autowired
    private BorrowedBookRepository bookRepository;
}
