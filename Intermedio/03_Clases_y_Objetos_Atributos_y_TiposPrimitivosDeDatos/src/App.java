public class App {
    public static void main(String[] args) throws Exception {
        Planeta tierra = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000,
                Planeta.tipoPlaneta.TERRESTRE,
                true);
        tierra.imprimePlaneta();
        System.out.println(tierra.calculaDensidad());
        System.out.println(tierra.esPlanetaExterior());
    }
}

class Planeta {

    String nombre = null;
    int numSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distSol = 0;

    public enum tipoPlaneta {
        GASEOSO, TERRESTRE, ENEANO
    }

    tipoPlaneta tipo;
    boolean esObserbable = false;

    public Planeta(String nombre, int numSatelites, double masa, double volumen, int diametro, int distSol,
            tipoPlaneta tipo, boolean esObserbable) {
        this.nombre = nombre;
        this.numSatelites = numSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distSol = distSol;
        this.tipo = tipo;
        this.esObserbable = esObserbable;
    }

    public void imprimePlaneta() {
        System.out.println(nombre);
        System.out.println(numSatelites);
        System.out.println(masa);
        System.out.println(volumen);
        System.out.println(diametro);
        System.out.println(distSol);
        System.out.println(tipo);
        System.out.println(esObserbable);
    }

    public float calculaDensidad() {
        return (float) (masa / volumen);
    }

    boolean esPlanetaExterior() {
        float limite = (float) (149597870 * 3.4);
        if (distSol > limite) {
            return true;
        } else {
            return false;
        }
    }

}