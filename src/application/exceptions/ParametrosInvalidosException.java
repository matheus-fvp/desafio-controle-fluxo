package application.exceptions;

public class ParametrosInvalidosException extends RuntimeException {

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
