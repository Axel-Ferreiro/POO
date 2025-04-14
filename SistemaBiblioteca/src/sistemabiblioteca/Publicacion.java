package sistemabiblioteca;

public abstract class Publicacion {

    private String titulo;
    private Integer anio;

    public Publicacion(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null && o.getClass() != this.getClass()) {
            return false;
        }
        Publicacion other = (Publicacion) o;

        return other.titulo.equals(titulo) && other.anio.equals(anio);

    }

    public String getTitulo() {
        return titulo;
    }



}
