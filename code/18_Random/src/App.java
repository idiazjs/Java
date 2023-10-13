import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa a: ");
        int a = scanner.nextInt();
        System.out.print("Ingresa b: ");
        int b = scanner.nextInt();
        double random = 0;
        int randomNumber = 0;
        if (b > a) {
            for (int i = 0; i < 1000; i++) {
                random = Math.random() * (b - a + 1) + a;
                randomNumber = (int) random;
                System.out.println(randomNumber);
                scanner.close();
            }
        } else {
            System.out.println("b debe ser mayor que a");
        }
    }
}
