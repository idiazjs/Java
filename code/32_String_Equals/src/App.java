import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String cadena1 = scan.nextLine();
        String cadena2 = scan.nextLine();
        if(cadena1.equals(cadena2)){
            System.out.println("Cadenas Iguales");
        }else{
            System.out.println("Cadenas Diferentes");
        }
        
        scan.close();
    }
}
