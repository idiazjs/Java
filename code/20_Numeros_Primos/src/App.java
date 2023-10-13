import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num <= 1) {
            System.out.println(num + " No es primo");
        } else {
            int raiz = (int)Math.sqrt(num);
            int cont = 0;
            for (int i = raiz; i > 1; i--) {
                if (num % i == 0) {
                    cont += 1;
                }
            }
            if (cont < 1){
                System.out.println(num + " Es primo");
            }else{
                System.out.println(num + " No es primo");
            }
        }
        scanner.close();
    }
}
