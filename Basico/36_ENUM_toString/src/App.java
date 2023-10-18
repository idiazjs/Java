import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String dia = scan.next();
        DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());
        System.out.println(diaS.toString());

        scan.close();
    }

    public enum DiasSemana {
        LUNES(true),
        MARTES(true),
        MIERCOLES(true),
        JUEVES(true),
        VIERNES(true),
        SABADO(false),
        DOMINGO(false);

        private boolean laborable;
        private DiasSemana(boolean laborable){
            this.laborable = laborable;
        }
        @Override
        public String toString(){
            if (laborable){
                return this.name().toUpperCase() + " es laborable";
            }else{
                return this.name().toUpperCase() + " no es laborable";
            }
        }

    }
}