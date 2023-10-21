public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido = new Pedido();
        pedido.calcularPedido("Costillitas", 120.50f, "Coca Cola", 18.50f);
        Pedido pedido2 = new Pedido();
        pedido2.calcularPedido("Costillitas", 120.50f, "Chilaquiles", 80.0f, "Coca Cola", 18.50f);
        Pedido pedido3 = new Pedido();
        pedido3.calcularPedido("Costillitas", 120.50f, "Chilaquiles", 80.0f, "Coca Cola", 18.50f, "Fresas con crema",
                50f);
    }
}

class Pedido {

    public void calcularPedido(String primerPlato, float costoPrimerPlato,
            String bebida, float costoBebida) {
        System.out.println("\nFactura...\n");
        System.out.println(primerPlato + ": $" + costoPrimerPlato);
        System.out.println(bebida + ": $" + costoBebida);
        float costo = costoPrimerPlato + costoBebida;
        System.out.println("Total: " + costo);
    }

    public void calcularPedido(String primerPlato, float costoPrimerPlato, String segundoPlato, float costoSegundoPlato,
            String bebida, float costoBebida) {
        System.out.println("\nFactura...\n");
        System.out.println(primerPlato + ": $" + costoPrimerPlato);
        System.out.println(segundoPlato + ": $" + costoSegundoPlato);
        System.out.println(bebida + ": $" + costoBebida);
        float costo = costoPrimerPlato + costoSegundoPlato + costoBebida;
        System.out.println("Total: " + costo);
    }

    public void calcularPedido(String primerPlato, float costoPrimerPlato, String segundoPlato, float costoSegundoPlato,
            String bebida, float costoBebida, String postre, float costoPostre) {
        System.out.println("\nFactura...\n");
        System.out.println(primerPlato + ": $" + costoPrimerPlato);
        System.out.println(segundoPlato + ": $" + costoSegundoPlato);
        System.out.println(bebida + ": $" + costoBebida);
        System.out.println(postre + ": $" + costoPostre);
        float costo = costoPrimerPlato + costoSegundoPlato + costoBebida + costoPostre;
        System.out.println("Total: " + costo);
    }
}