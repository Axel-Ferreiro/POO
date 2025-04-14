
package sistemabiblioteca;


public class Libro extends Publicacion {
    private String autor;
    private Genero genero;

    public Libro(String autor, Genero genero,String titulo, int anio) {
        super(titulo, anio);
        this.autor = autor;
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", genero=" + genero + '}';
    }




    
    
    
}
