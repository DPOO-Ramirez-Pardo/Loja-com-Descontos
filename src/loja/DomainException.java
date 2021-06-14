package loja;

public class DomainException extends RuntimeException {

    private static final long serialVersionUId = 1L;

    public DomainException(String mensagem) {
        super(mensagem);
    }
}
