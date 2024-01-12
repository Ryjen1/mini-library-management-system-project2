package yukay.net.minilibrarymanagementsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    @Email
    @NotEmpty(message = "must not be empty")
    @Column(unique = true)
    private String email;
    @NotBlank(message = "Full name is required")
    @Size(min = 6, max = 15, message = "Full name must be between 6 and 15 characters")
    @Column(name = "full_name")
    private String fullName;
    @NotNull(message = "must not be empty")
    @Max(value = 70, message = "Above 70 can not apply")
    @Min(value = 18, message = "Below 18 cannot apply")
    private Long age;

    @OneToMany(mappedBy = "user")
    private List<BorrowedBook> borrowedBooks;
    @NotBlank(message = "Full name is required")
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
