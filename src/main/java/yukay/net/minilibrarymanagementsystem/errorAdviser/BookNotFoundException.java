package yukay.net.minilibrarymanagementsystem.errorAdviser;

public class BookNotFoundException extends Exception{
    public BookNotFoundException() {
    }

    public BookNotFoundException(String message) {
        super(message);
    }
}
