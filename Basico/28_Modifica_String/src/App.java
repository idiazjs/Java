import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String texto = scan.nextLine();
        String nuevoTexto = "";
        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
            if (caracter != ' ') {
                nuevoTexto += caracter;
            }
        }
        System.out.println(nuevoTexto);

        scan.close();
    }
}
