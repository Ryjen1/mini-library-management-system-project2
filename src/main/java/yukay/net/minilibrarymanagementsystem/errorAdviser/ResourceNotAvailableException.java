package yukay.net.minilibrarymanagementsystem.errorAdviser;

public class ResourceNotAvailableException extends Exception{
    public ResourceNotAvailableException() {
    }

    public ResourceNotAvailableException(String message) {
        super(message);
    }
}
