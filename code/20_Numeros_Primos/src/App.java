import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean esPrimo = true;
        if (num <= 1) {
            esPrimo = false;
        } else {
            int raiz = (int) Math.sqrt(num);
            for (int i = raiz; i > 1; i--) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo) {
            System.out.println(num + " Es primo");
        } else {
            System.out.println(num + " No es primo");
        }
        scanner.close();
    }
}
