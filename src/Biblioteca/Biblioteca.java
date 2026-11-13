package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    // Registrar libros
    public void registrarLibro(Libro libro) {
        this.libros.add(libro);
        System.out.println("Libro registrado exitosamente: " + libro.getTitulo());
    }

    // Registrar usuarios
    public void registrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
        System.out.println("Usuario registrado con exito: " + usuario.getNombre());
    }

    // Consultar libros
    public void consultarLibros() {

        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros registrados actualmente.");
            return;
        }

        for (Libro libro : libros) {
            System.out.println("Titulo: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Genero: " + libro.getGenero());
            System.out.println("Edicion: " + libro.getEdicion());
            System.out.println("Publicacion: " + libro.getPublicacion());
            System.out.println("Disponible: " + libro.isDisponible());
            System.out.println("--------------------------");
        }
    }

    // Prestar libros
    public void prestarLibro(String titulo, String dni) {

        Libro libroEncontradoObjeto = null;
        boolean usuarioEncontrado = false;

        // 1. Buscar el libro.
        for (Libro libro : libros) {

            if (libro.getTitulo().equals(titulo)) {
                libroEncontradoObjeto = libro;
                break;
            }
        }

        // 2. Buscar al usuario.
        for (Usuario usuario : usuarios) {

            if (usuario.getDni().equals(dni)) {
                usuarioEncontrado = true;
                System.out.println("Usuario encontrado: " + usuario.getNombre());
                break;
            }
        }

        // 3. Comprobar que ambos existan.
        if (libroEncontradoObjeto == null) {
            System.out.println("Libro no encontrado.");
            return;
        }

        if (!usuarioEncontrado) {
            System.out.println("Usuario no encontrado.");
            return;
        }

        // 4. Comprobar disponibilidad.
        if (!libroEncontradoObjeto.isDisponible()) {
            System.out.println("El libro no esta disponible.");
            return;
        }

        // 5. Realizar el prestamo.
        libroEncontradoObjeto.setDisponible(false);
        System.out.println("Libro prestado exitosamente.");
    }

    // Devolver libros
    public void devolverLibro(String titulo) {

        boolean libroEncontrado = false;

        for (Libro libro : libros) {

            if (libro.getTitulo().equals(titulo)) {
                libro.setDisponible(true);
                libroEncontrado = true;

                System.out.println("Libro devuelto exitosamente.");
                break;
            }
        }

        if (!libroEncontrado) {
            System.out.println("El libro no se encontro.");
        }
    }
}