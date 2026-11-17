package Inventario;

import java.util.ArrayList;
// Inventario: registro, consulta y búsqueda.
public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void registrarProducto(Producto producto) {
        this.productos.add(producto);
        System.out.println("Producto registrado exitosamente: " + producto.getNombre());
    }

    public void consultarProductos() {

        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }

        for (Producto producto : productos) {
            System.out.println("Id: " + producto.getId());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Stock: " + producto.getStock());
            System.out.println("----------------------");
        }
    }

    public void buscarProducto(int id) {

        boolean encontrado = false;

        for (Producto producto : productos) {
            // == primitivos
            if (producto.getId() == id) {
                encontrado = true;
                System.out.println("Producto encontrado: " + producto.getNombre());
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado");
        }
    }

    public void agregarExistencias(int id, int cantidad) {
        // Variable centinela.
        boolean encontrado = false;

        // Validar que cantidad no sea negativo.
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor a 0.");
            return;
        }

        for (Producto producto : productos) {

            if (producto.getId() == id) {
                encontrado = true;
                producto.agregarStock(cantidad);
                System.out.println("La cantidad agregada del producto " + producto.getNombre() + " fue de " + cantidad);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    public void retirarExistencias(int id, int cantidad) {

        boolean encontrado = false;

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor a 0.");
            return;
        }

        for (Producto producto : productos) {

            if (producto.getId() == id) {
                encontrado = true;

                // Comprobar que exista stock suficiente.
                if (cantidad > producto.getStock()) {
                    System.out.println("Stock insuficiente.");
                    return;
                }

                producto.retirarStock(cantidad);

                System.out.println(
                        "La cantidad retirada del producto "
                                + producto.getNombre()
                                + " fue de " + cantidad
                );

                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }
}
