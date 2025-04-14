
package sistemabiblioteca;


public class Revista extends Publicacion implements Leible {
    private int numeroEdicion;

    public Revista(String titulo, int anio,int numeroEdicion) {
        super(titulo, anio);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void leer() {
       System.out.println("Ha sido leido: " + super.getTitulo());
    }

    @Override
    public String toString() {
        return "Revista{" + "numeroEdicion=" + numeroEdicion + '}';
    }


    
}
