public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema pedidos de restaurante");
        System.out.println("");
       
        //Escenario 1 Pedido normal
        System.out.println("Escenario 1 Pedido Normal");
        Pedido pedido1 = new Pedido("Ivan Hernandez");
        pedido1.agregarArticulo("Pizza Margarita", 2, 8.50);
        pedido1.agregarArticulo("Ensalada Cesar", 1, 6.00);
        pedido1.agregarArticulo("Coca-Cola", 2, 2.50);
        pedido1.mostrarResumen();
        pedido1.cambiarEstado(EstadoPedido.LISTO_PARA_ENTREGAR);
        pedido1.cambiarEstado(EstadoPedido.ENTREGADO);
       
        //Escenario 2 Intentar agregar mas de 5 articulos
        System.out.println("\n");
        System.out.println("Escenario 2 Limite de Articulos");
        Pedido pedido2 = new Pedido("Jose Ruiz");
        pedido2.agregarArticulo("Hamburguesa", 1, 9.00);
        pedido2.agregarArticulo("Papas Fritas", 1, 3.50);
        pedido2.agregarArticulo("Nuggets", 1, 5.00);
        pedido2.agregarArticulo("Refresco", 1, 2.00);
        pedido2.agregarArticulo("Helado", 1, 4.00);
        pedido2.agregarArticulo("Cafe", 1, 1.50);
        pedido2.mostrarResumen();
       
        //Escenario 3 Intentar retroceder estado
        System.out.println("\n");
        System.out.println("Escenario 3 Validacion de Estado");
        Pedido pedido3 = new Pedido("Izan Garcia");
        pedido3.agregarArticulo("Sushi Roll", 3, 12.00);
        pedido3.cambiarEstado(EstadoPedido.LISTO_PARA_ENTREGAR);
        pedido3.cambiarEstado(EstadoPedido.ENTREGADO);
        System.out.println("\n");
        System.out.println("Retrocediendo el estado");
        pedido3.cambiarEstado(EstadoPedido.EN_PREPARACION);
        pedido3.mostrarResumen();
       
        //Escenario 4 Pedido vacio
        System.out.println("\n");
        System.out.println("Escenario 4 Pedido Vacio");
        Pedido pedido4 = new Pedido("Carlos Martinez");
        pedido4.mostrarResumen();
       
        //Escenario 5 Validaciones
        System.out.println("\n");
        System.out.println("Escenario 5 Validaciones");
        Pedido pedido5 = new Pedido("Ana Rodriguez");
        pedido5.agregarArticulo("Paella", 0, 15.00);
        pedido5.agregarArticulo("Vino Tinto", 2, 7.50);
        pedido5.agregarArticulo("Croquetas", 4, 5.00);
        pedido5.mostrarResumen();
    }
}
