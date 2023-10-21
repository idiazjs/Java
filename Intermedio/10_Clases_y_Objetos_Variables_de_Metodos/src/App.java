public class App {
    public static void main(String[] args) throws Exception {
        ConversorMetros conversorMetros = new ConversorMetros(4.4f);
        System.out.println(conversorMetros.metroCentimetro());
        System.out.println(conversorMetros.metroMilimetros());
        System.out.println(conversorMetros.metroPulgadas());
        System.out.println(conversorMetros.metroPies());
        System.out.println(conversorMetros.metroYardas());
    }
}

class ConversorMetros {
    private float metros;
    private final int factCentimetros = 100;
    private final int factMilimetros = 1000;
    private final float factPulgadas = 39.37f;
    private final float factPies = 3.28f;
    private final float factYardas = 1.09f;

    public ConversorMetros(float metros) {
        this.metros = metros;
    }

    public float getMetros() {
        return metros;
    }

    public void setMetros(float metros) {
        this.metros = metros;
    }

    public float metroCentimetro() {
        float centimetros = metros * factCentimetros;
        return centimetros;
    }

    public float metroMilimetros() {
        float milimetros = metros * factMilimetros;
        return milimetros;
    }

    public float metroPulgadas() {
        float pulgadas = metros * factPulgadas;
        return pulgadas;
    }

    public float metroPies() {
        float pies = metros * factPies;
        return pies;
    }

    public float metroYardas() {
        float yardas = metros * factYardas;
        return yardas;
    }
}