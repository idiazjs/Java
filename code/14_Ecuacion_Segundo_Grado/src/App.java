import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();

        double raiz = Math.pow(b, 2) - (4 * a * c);
        if (raiz > 0) {
            double x1 = ((b * (-1)) + Math.sqrt(raiz)) / (2 * a);
            double x2 = ((b * (-1)) - Math.sqrt(raiz)) / (2 * a);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else {
            System.out.println("La raiz es negativa");
        }
        scanner.close();
    }
}
