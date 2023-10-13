import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = -1;
        do {
            i = scanner.nextInt();
        } while (i != 0);
        scanner.close();
    }
}
