public class Pedido {
    // Atributos en private
    private static int contadorId = 1;
    private int id;
    private String nombreCliente;
    private Articulo[] articulos; 
    private int numArticulos; 
    private EstadoPedido estado;
    private static final int MAX_ARTICULOS = 5;

    // Constructor
    public Pedido(String nombreCliente) {
        this.id = contadorId++;
        this.nombreCliente = nombreCliente;
        this.articulos = new Articulo[MAX_ARTICULOS];
        this.numArticulos = 0;
        this.estado = EstadoPedido.EN_PREPARACION;
    }

    // Agregamos el articulo
    public boolean agregarArticulo(String nombre, int cantidad, double precioUnidad) {
        // Validamos maximo 5 articulos
        if (numArticulos >= MAX_ARTICULOS) {
            System.out.println("Maximo 5 articulos");
            return false;
        }
        
        // Validamos cantidad y precio positivos
        if (cantidad <= 0 || precioUnidad <= 0) {
            System.out.println("Cantidad y precio deben ser positivos");
            return false;
        }
        
        // Aqui guardarmos el artículo
        articulos[numArticulos] = new Articulo(nombre, cantidad, precioUnidad);
        numArticulos++;
        return true;
    }

    // Calculamos el total
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < numArticulos; i++) {
            total += articulos[i].getPrecioTotal();
        }
        return total;
    }

    // Cambiar estado
    public boolean cambiarEstado(EstadoPedido nuevoEstado) {
        // No permitimos retroceder
        if (nuevoEstado.ordinal() < estado.ordinal()) {
            System.out.println("No se puede retroceder el estado");
            return false;
        }
        estado = nuevoEstado;
        return true;
    }

    // Mostramos el resumen
    public void mostrarResumen() {
        System.out.println("PEDIDO #" + id);
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Estado: " + estado);
        
        for (int i = 0; i < numArticulos; i++) {
            System.out.println((i + 1) + ". " + articulos[i]);
        }
        
        System.out.println("TOTAL: " + calcularTotal() + " euros");
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public int getNumArticulos() {
        return numArticulos;
    }
}
