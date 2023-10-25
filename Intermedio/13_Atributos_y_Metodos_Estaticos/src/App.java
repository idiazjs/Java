public class App {
    public static void main(String[] args) throws Exception {
        Atleta atleta1 = new Atleta("Alejandro Perlaza", 9.55);
        Atleta atleta2 = new Atleta("Anthony Zambrano", 9.28);
        Atleta atleta3 = new Atleta("Diego Palomeque", 9.53);
        Atleta atleta4 = new Atleta("Gilmar Herrera", 9.29);
        Atleta.imprimeSeleccion();
        atleta1.correr400m();
        Atleta.imprimeTiempoEquipo();
        atleta2.correr400m();
        Atleta.imprimeTiempoEquipo();
        atleta3.correr400m();
        atleta4.correr400m();
        Atleta.imprimeTiempoEquipo();
        Atleta.imprimeTotalAtletas();

        System.out.println();
        atleta1.imprimeAtleta();

        System.out.println();
        atleta2.imprimeAtleta();
    }
}

class Atleta {
    private int idAtleta = 0;
    private String nomAtleta;
    private double tiempoAtleta;
    private static int numAtletas = 0;
    private static String seleccion = "Colombia";
    private static double tiempoEquipo;

    public Atleta(String nomAtleta, double tiempoAtleta) {
        this.idAtleta = numAtletas + 10;
        this.nomAtleta = nomAtleta;
        this.tiempoAtleta = tiempoAtleta;
        numAtletas += 1;
    }

    public String getNomAtleta() {
        return this.nomAtleta;
    }

    public void setNomAtleta(String nomAtleta) {
        this.nomAtleta = nomAtleta;
    }

    public double getTiempoAtleta() {
        return this.tiempoAtleta;
    }

    public void setTiempoAtleta(double tiempoAtleta) {
        this.tiempoAtleta = tiempoAtleta;
    }

    public void correr400m() {
        tiempoEquipo += tiempoAtleta;
    }

    public static void imprimeSeleccion() {
        System.out.println(seleccion);
    }

    public static void imprimeTiempoEquipo() {
        System.out.println("Tiempo del equipo: " + tiempoEquipo);
    }

    public static void imprimeTotalAtletas() {
        System.out.println("Total de atletas: " + numAtletas);
    }

    public void imprimeAtleta() {
        System.out.println("id: " + idAtleta);
        System.out.println("Nombre: " + nomAtleta);
        System.out.println("Tiempo: " + tiempoAtleta);
    }

}