public class App {
    public static void main(String[] args) throws Exception {
        Avion avion1 = new Avion("Airbus", 4);
        Avion avion2;
        avion2 = avion1;
        avion1.imprimeFabricante();
        avion2.imprimeFabricante();
        avion1.setnomFabricante("Douglas");
        avion1.imprimeFabricante();
        avion2.imprimeFabricante();
        avion1.cambiarFabricante(avion2);
        avion1.imprimeFabricante();
        avion2.imprimeFabricante();
    }
}

class Avion {
    private String nomFabricante;
    private int numMotores;

    public Avion(String nomFabricante, int numMotores) {
        this.nomFabricante = nomFabricante;
        this.numMotores = numMotores;
    }

    public String getnomFabricante() {
        return this.nomFabricante;
    }

    public void setnomFabricante(String nomFabricante) {
        this.nomFabricante = nomFabricante;
    }

    public int getNumMotores() {
        return this.numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

    public void imprimeFabricante() {
        System.out.println(nomFabricante);
    }

    public void cambiarFabricante(Avion avion) {
        avion.nomFabricante = "Loockhead";
    }

}