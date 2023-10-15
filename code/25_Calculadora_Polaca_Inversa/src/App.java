import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        double num1 = scan.nextInt();
        String operador = scan.next();
        double num2 = scan.nextInt();

        switch (operador) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "^":
                System.out.println(Math.pow(num1, num2));
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Operador no valido");
        }
        scan.close(); 
    }
}