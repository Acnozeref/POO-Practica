package Inventario;

import java.util.ArrayList;
// Inventario: registro, consulta y búsqueda.
public class Inventario {

    private ArrayList<Producto> productos;
    private ArrayList<Movimiento> movimientos;

    public Inventario() {
        this.productos = new ArrayList<>();
        this.movimientos = new ArrayList<>();
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
                // Registro entrada de productos.
                Movimiento movimiento = new Movimiento(producto, "ENTRADA", cantidad);
                movimientos.add(movimiento);

                System.out.println("La cantidad agregada del producto "
                            + producto.getNombre() +
                                " fue de " + cantidad);
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
                // Registro de SALIDA de stock
                Movimiento movimiento = new Movimiento(producto, "SALIDA", cantidad);
                movimientos.add(movimiento);

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

    public void consultarMovimientos() {

        if (movimientos.isEmpty()) {
            System.out.println("No hay movimientos registrados.");
        }

        for (Movimiento movimiento : movimientos) {
            // Encadenacion de llamadas,
            System.out.println("ID: " + movimiento.getProducto().getId());
            System.out.println("Producto: " + movimiento.getProducto().getNombre());
            System.out.println("Tipo: " + movimiento.getTipo());
            System.out.println("Cantidad: " + movimiento.getCantidad());
            System.out.println("---------------------");
        }
    }
}
