import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        int limite = scan.nextInt();
        if (limite <= 1) {
            System.out.println("Valor invalido");
        } else {
            for (int i = 1; i <= limite; i++) {
                System.out.print(suma + " + " + i + " = ");
                suma += i;
                System.out.println(suma);
            }
        }

        scan.close();
    }
}
