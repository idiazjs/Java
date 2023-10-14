import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        final int iva = 21;
        float precio = scanner.nextFloat();
        float precio_final = (float) ((precio * iva) / 100) + precio;
        System.out.println(precio_final);
        scanner.close();
    }
}