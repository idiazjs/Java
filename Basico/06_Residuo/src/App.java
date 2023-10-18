import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n%2 == 0){
            System.out.println("Es divisible entre 2");
        }
        else{
            System.out.println("No es divisible entre 2");
        }
        scanner.close();
    }
}
