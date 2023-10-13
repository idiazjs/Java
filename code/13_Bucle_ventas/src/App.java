import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el numero de ventas: ");
        int noVentas = scanner.nextInt();
        float suma = 0, venta = 0;
        for (int i = 1; i <= noVentas; i++) {
            System.out.print("Venta (" + i + ") precio: ");
            venta = scanner.nextFloat();
            suma += venta;
        }
        System.out.println(suma);
        scanner.close();
    }
}
