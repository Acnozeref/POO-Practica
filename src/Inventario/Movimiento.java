package Inventario;

public class Movimiento {

    private Producto producto;
    private String tipo;
    private int cantidad;

    public Movimiento (Producto producto, String tipo, int cantidad) {
        this.producto = producto;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }
}
