package yukay.net.minilibrarymanagementsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;
@Entity
@Data

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    @NotEmpty(message = "must not be empty")
    private String title;
    @NotEmpty(message = "must not be empty")
    private String author;

    @Column(unique = true)
    @NotEmpty(message = "must not be empty")
    private String isbn;
    @NotNull(message = "must not be empty")
    private Long publicationYear;
    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "book")
    private List<BorrowedBook> borrowedBy;

    public Book() {
    }

    public Book(Long bookId, String title, String author, String isbn, Long publicationYear, User user, List<BorrowedBook> borrowedBy) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.user = user;
        this.borrowedBy = borrowedBy;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Long publicationYear) {
        this.publicationYear = publicationYear;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<BorrowedBook> getBorrowedBy() {
        return borrowedBy;
    }

    public void setBorrowedBy(List<BorrowedBook> borrowedBy) {
        this.borrowedBy = borrowedBy;
    }
}
