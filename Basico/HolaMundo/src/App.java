import java.util.Scanner;
public class App {
    public int Suma(int a, int b){
        return a+b;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        App app = new App();
        int x = app.Suma(a,b);
        System.out.println(x);
        scanner.close();
    }
}
