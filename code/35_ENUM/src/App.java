import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String dia = scan.next();
        DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());
        switch (diaS) {
            case LUNES:
                System.out.println("Laborable");
                break;
            case MARTES:
                System.out.println("Laborable");
                break;
            case MIERCOLES:
                System.out.println("Laborable");
                break;
            case JUEVES:
                System.out.println("Laborable");
                break;
            case VIERNES:
                System.out.println("Laborable");
                break;
            case SABADO:
                System.out.println("No Laborable");
                break;
            case DOMINGO:
                System.out.println("No Laborable");
                break;
        }

        scan.close();
    }

    public enum DiasSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO;
    }
}
