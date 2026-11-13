package Biblioteca;

public class MainBiblioteca {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Crear libros
        Libro libro01 = new Libro(
                "Clean Code",
                "Robert C. Martin",
                "2008",
                "Primera",
                "Programacion",
                true
        );

        Libro libro02 = new Libro(
                "Design Patterns",
                "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides",
                "1994",
                "Primera",
                "Ingenieria de Software",
                true
        );

        // Crear usuarios
        Usuario usuario1 = new Usuario(
                "Kevin Tenorio",
                "12345678A",
                26,
                "Masculino"
        );

        Usuario usuario2 = new Usuario(
                "Carlos Mendoza",
                "87654321B",
                35,
                "Masculino"
        );

        // Registrar libros y usuarios
        biblioteca.registrarLibro(libro01);
        biblioteca.registrarLibro(libro02);

        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        // Consultar libros
        biblioteca.consultarLibros();

        // Pruebas de prestamos
        biblioteca.prestarLibro("Clean Code", "12345678A");

        // Intentar prestar nuevamente el mismo libro
        biblioteca.prestarLibro("Clean Code", "12345678A");

        // Intentar prestar un libro inexistente
        biblioteca.prestarLibro("Java Avanzado", "12345678A");

        // Intentar prestar con un usuario inexistente
        biblioteca.prestarLibro("Design Patterns", "00000000X");

        // Devolver libro
        biblioteca.devolverLibro("Clean Code");

        // Consultar disponibilidad después de la devolución
        biblioteca.consultarLibros();
    }
}
