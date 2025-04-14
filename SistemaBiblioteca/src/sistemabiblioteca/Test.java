
package sistemabiblioteca;

public class Test {


    public static void main(String[] args) {
         Biblioteca b1 = new Biblioteca();

        Publicacion lib1 = new Libro("Borges",Genero.FICCION,"cielos",19);
        Publicacion lib2 = new Libro("Marquez",Genero.NO_FICCION,"vuelos",30);
        Publicacion rev1 = new Revista("titulo",10,2023);
        Publicacion rev2 = new Revista("titulo2",12,2024);
        Publicacion ilu1 = new Ilustracion("manuel",102,104,"titulo2",2023);
        Publicacion ilu2 = new Ilustracion("manuel2",102,104,"titulo3",2024);

        try {
            b1.agregarPublicacion(lib1);
            b1.agregarPublicacion(lib2);
            b1.agregarPublicacion(rev1);
            b1.agregarPublicacion(rev2);
            b1.agregarPublicacion(ilu1);
            b1.agregarPublicacion(ilu2);

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        
        b1.mostrarPublicaciones();
        System.out.println("-----------------------------");
        b1.leerPublicaciones(rev2);
    }
    
}
