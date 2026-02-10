public class Articulo {
    //Atributos
    private String nombre;
    private int cantidad;
    private double precioUnidad;

    //Constructor
    public Articulo(String nombre, int cantidad, double precioUnidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    //Calcular precio total del articulo
    public double getPrecioTotal() {
        return cantidad * precioUnidad;
    }

    //Convertir a texto
    public String toString() {
        return nombre + " x" + cantidad + " - " + precioUnidad + " euros (Total: " + getPrecioTotal() + " euros)";
    }
}
