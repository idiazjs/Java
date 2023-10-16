import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int cont = 0;
        do{
            cont += 1;
            num = scan.nextInt();
        }while (num != -1);
        System.out.println(cont);
        
        scan.close();
    }
}
