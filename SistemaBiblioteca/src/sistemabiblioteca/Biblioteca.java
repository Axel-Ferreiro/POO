
package sistemabiblioteca;

import java.util.ArrayList;


public class Biblioteca {
    
    private ArrayList<Publicacion> publicaciones = new ArrayList<>();
    
    public void agregarPublicacion(Publicacion publicacion) {
        if (publicacion == null) {
            throw new NullPointerException("Me pasaste un null.");
        }
        if (publicaciones.contains(publicacion)) {
            throw new PublicacionRepetidaException();
        }
        publicaciones.add(publicacion);
    }
    
    public void mostrarPublicaciones() {
        if (publicaciones.isEmpty()) {
            System.out.println("Lista de publicaciones vacia.");
        }
        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion);
        }
    }
    
    public void leerPublicaciones(Publicacion publicacion) {
        if (publicacion instanceof Leible p) {
            p.leer();
        } else {
            System.out.println("no es leible");
        }
    }
}
