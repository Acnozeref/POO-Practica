package Inventario;
// MainInventario: creación de objetos y pruebas.
public class MainInventario {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        // Creamos productos.
        Producto producto01 = new Producto(
                101,
                "Teclado mecánico",
                850.00,
                15
        );
        Producto producto02 = new Producto(
                102,
                "Mouse Inalámbrico",
                350.00,
                25
        );
        Producto producto03 = new Producto(
                103,
                "Monitor 24 pulgadas",
                2800.00,
                10
        );
        Producto producto04 = new Producto(
                104,
                "Audífonos Bluetooth",
                650.00,
                20
        );
        Producto producto05 = new Producto(
                105,
                "Memoria USB 64GB",
                180.00,
                30
        );

        // Registro de productos.
        inventario.registrarProducto(producto01);
        inventario.registrarProducto(producto02);
        inventario.registrarProducto(producto03);
        inventario.registrarProducto(producto04);
        inventario.registrarProducto(producto05);

        // Consulta de todos los productos.
        inventario.consultarProductos();

        // Buscar un producto (encontrado).
        inventario.buscarProducto(103);
        inventario.buscarProducto(105);

        // Buscar producto inexistente.
        inventario.buscarProducto(999);
    }
}
