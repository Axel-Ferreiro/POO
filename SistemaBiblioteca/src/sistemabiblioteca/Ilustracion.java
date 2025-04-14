
package sistemabiblioteca;


public class Ilustracion extends Publicacion implements Leible {
    
    private String nombreIlustrador;
    private int ancho;
    private int alto;

    public Ilustracion(String nombreIlustrador, int ancho, int alto, String titulo, int anio) {
        super(titulo, anio);
        this.nombreIlustrador = nombreIlustrador;
        validarNumero(ancho);
        this.ancho = ancho;
        validarNumero(alto);
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Ilustracion{" + "nombreIlustrador=" + nombreIlustrador + ", ancho=" + ancho + ", alto=" + alto + '}';
    }
    
    public void validarNumero(int numero){
        if(numero <= 0){
        throw new IllegalArgumentException("Numero no permitido, debe ser mayor a 0");
        }
    }

    @Override
    public void leer() {
       System.out.println("Ha sido leido: " + super.getTitulo());
    }




    
    
}
