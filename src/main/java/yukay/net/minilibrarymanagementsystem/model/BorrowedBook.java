package yukay.net.minilibrarymanagementsystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class BorrowedBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long borrowedBookId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public BorrowedBook() {
    }

    public BorrowedBook(Long borrowedBookId, User user, Book book) {
        this.borrowedBookId = borrowedBookId;
        this.user = user;
        this.book = book;
    }

    public Long getBorrowedBookId() {
        return borrowedBookId;
    }

    public void setBorrowedBookId(Long borrowedBookId) {
        this.borrowedBookId = borrowedBookId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
