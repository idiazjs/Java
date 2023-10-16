import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String texto = scan.nextLine();
        System.out.print("1/UPPER 2/lower: ");
        int opcion = scan.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(texto.toUpperCase());
                break;
            case 2:
                System.out.println(texto.toLowerCase());
                break;
            default:
                System.out.println("Opcion invalida");
        }

        scan.close();
    }
}
