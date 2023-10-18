import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do {
            num = scanner.nextInt();
        } while (num < 0);
        String StNum = String.valueOf(num);
        System.out.println(StNum.length());
        scanner.close();
    }
}
