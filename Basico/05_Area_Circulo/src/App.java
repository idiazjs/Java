import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        float area = 0f;
        float r = 0f;
        final float pi = 3.1416f;
        System.out.print("Ingresa el radio: ");
        r = scanner.nextFloat();
        area = (float)(pi * Math.pow( r,2));
        System.out.println(area);
        scanner.close();
    }
}