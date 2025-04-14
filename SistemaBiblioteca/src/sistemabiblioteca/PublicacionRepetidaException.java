package sistemabiblioteca;

public class PublicacionRepetidaException extends RuntimeException {

    private static final String MESSAGE = "YA EXISTE LA PUBLICACION QUE DESEA AGREGAR";

    public PublicacionRepetidaException() {
        super(MESSAGE);
    }

}
