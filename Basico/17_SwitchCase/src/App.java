import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String dia = scanner.nextLine();
        switch (dia) {
            case "Lunes":
                System.out.println("Dia laboral");
                break;
            case "Martes":
                System.out.println("Dia laboral");
                break;
            case "Miércoles":
                System.out.println("Dia laboral");
                break;
            case "Jueves":
                System.out.println("Dia laboral");
                break;
            case "Viernes":
                System.out.println("Dia laboral");
                break;
            case "Sábado":
                System.out.println("Fin de semana");
                break;
            case "Domingo":
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Día no válido");
        }
        scanner.close();
    }
}
