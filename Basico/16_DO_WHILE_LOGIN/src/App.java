import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String pass = "1234";
        String passValida = "";
        
        int intento = 1;
        do{
            passValida = scanner.nextLine();
            if(pass.equals(passValida)){
                System.out.println("Enhorabuena");
                break;
            }
            intento +=1;
        }while(intento <= 3);
        
        Boolean acceso = false;
        passValida = "";
        for(int i = 1; i<=3 && !acceso; i++){
            passValida = scanner.nextLine();
            if(pass.equals(passValida)){
                System.out.println("Enhorabuena");
                acceso = true;
            }
        }
        scanner.close();
    }
}
