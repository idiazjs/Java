import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String cadena = "";
        String nuevaCadena = "";
        do{
            cadena = scan.nextLine();
            nuevaCadena += cadena;
        }
        while(!cadena.isEmpty());
        System.out.println(nuevaCadena);

        scan.close();
    }
}
