package exceptions;

public class CnpjDeTamanhoInvalidoException extends RuntimeException {

    public CnpjDeTamanhoInvalidoException(String message) {
        super(message);
    }

    public CnpjDeTamanhoInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
