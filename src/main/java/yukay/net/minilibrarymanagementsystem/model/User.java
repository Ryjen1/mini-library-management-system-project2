package yukay.net.minilibrarymanagementsystem.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    @Column(unique = true)
    private String email;
    private String fullName;
    private Long age;

    @OneToMany(mappedBy = "user")
    private List<BorrowedBook> borrowedBooks;
    private String address;

    public User() {
    }

    public User(Long bookId, String email, String fullName, Long age, List<BorrowedBook> borrowedBooks, String address) {
        this.bookId = bookId;
        this.email = email;
        this.fullName = fullName;
        this.age = age;
        this.borrowedBooks = borrowedBooks;
        this.address = address;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public List<BorrowedBook> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<BorrowedBook> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
