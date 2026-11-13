package Biblioteca;

public class Usuario {

    private String nombre;
    private String dni;
    private int edad;
    private String genero;

    public Usuario(String nombre, String dni, int edad, String genero) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.genero = genero;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }
}