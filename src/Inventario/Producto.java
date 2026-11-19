package Inventario;
// Producto: atributos, constructor, getters y control de stock.
public class Producto {
    // Atributos a trabajar.
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    // Constructor.
    public Producto (int id, String nombre, double precio, int stock) {

            // Validación de datos en constructores.
            if (id <= 0) {
                throw new IllegalArgumentException(
                        "El ID debe ser mayor a cero."
                );
            }

            if (nombre == null || nombre.isBlank()) {
                throw new IllegalArgumentException(
                        "El nombre no de estar vacio"
                );
            }

            if (precio <= 0 || stock < 0) {

                throw new IllegalArgumentException(
                        "El precio debe ser mayor a cero y el stock no puede ser negativo."
                );
            }

            this.id = id;
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
    }
    // Métodos para controlar las existencias.
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    // Setters, modifica stock bajo x condición.
    public void agregarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
        }
    }

    public void retirarStock(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            this.stock -= cantidad;
        }
    }
}
// Concepto clave: encapsulamiento.
