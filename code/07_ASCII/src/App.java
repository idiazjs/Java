import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        i = scanner.nextInt();
        char x = (char) i;
        String ascci = Character.toString(x);
        System.out.println(ascci);
        scanner.close();
    }
}
