package yukay.net.minilibrarymanagementsystem.errorAdviser;

public class BookIsNotAvailableToBorrowedException extends Exception {
    public BookIsNotAvailableToBorrowedException() {
    }

    public BookIsNotAvailableToBorrowedException(String message) {
        super(message);
    }

    public BookIsNotAvailableToBorrowedException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookIsNotAvailableToBorrowedException(Throwable cause) {
        super(cause);
    }

    public BookIsNotAvailableToBorrowedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
