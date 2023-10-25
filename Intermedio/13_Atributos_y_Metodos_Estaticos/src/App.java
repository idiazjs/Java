public class App {
    public static void main(String[] args) throws Exception {
        Atleta atleta1 = new Atleta(0, "Alejandro Perlaza", 9.55);
        Atleta atleta2 = new Atleta(1, "Anthony Zambrano", 9.28);
        Atleta atleta3 = new Atleta(2, "Diego Palomeque", 9.53);
        Atleta atleta4 = new Atleta(3, "Gilmar Herrera", 9.29);
        Atleta.imprimeSeleccion();
        atleta1.correr400m();
        Atleta.imprimeTiempoEquipo();
        atleta2.correr400m();
        Atleta.imprimeTiempoEquipo();
        atleta3.correr400m();
        atleta4.correr400m();
        Atleta.imprimeTiempoEquipo();
        Atleta.imprimeTotalAtletas();
    }
}

class Atleta {
    private int idAtleta;
    private String nomAtleta;
    private double tiempoAtleta;
    private static int numAtletas = 0;
    private static String seleccion = "Colombia";
    private static double tiempoEquipo;

    public Atleta(int idAtleta, String nomAtleta, double tiempoAtleta) {
        this.idAtleta = idAtleta;
        this.nomAtleta = nomAtleta;
        this.tiempoAtleta = tiempoAtleta;
        numAtletas += 1;
    }

    public int getIdAtleta() {
        return this.idAtleta;
    }

    public void setIdAtleta(int idAtleta) {
        this.idAtleta = idAtleta;
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
        System.out.println(tiempoEquipo);
    }

    public static void imprimeTotalAtletas() {
        System.out.println(numAtletas);
    }

}