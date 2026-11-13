package Biblioteca;

public class Libro {

    private String titulo;
    private String autor;
    private String publicacion;
    private String edicion;
    private String genero;
    private boolean disponible;

    public Libro(String titulo, String autor, String publicacion,
                 String edicion, String genero, boolean disponible) {

        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.edicion = edicion;
        this.genero = genero;
        this.disponible = disponible;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Setter
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}