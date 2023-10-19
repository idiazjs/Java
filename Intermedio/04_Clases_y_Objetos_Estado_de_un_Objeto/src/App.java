public class App {
    public static void main(String[] args) throws Exception {
        Auto auto = new Auto("Ford", 2018, 40, Auto.tipoCombustible.GASOLINA, 4, 4, 255, Auto.tipoColor.NEGRO, 100);
        System.out.println(auto.getVelocidadActual());
        auto.aceleraAuto(20);
        System.out.println(auto.getVelocidadActual());
        auto.desAcelerarAuto(50);
        System.out.println(auto.getVelocidadActual());
        auto.desAcelerarAuto(500);
        System.out.println(auto.getVelocidadActual());
        auto.frenaAuto();
        System.out.println(auto.getVelocidadActual());
        System.out.println("Estadisticas: ");
        auto.imprimeAuto();
    }
}

class Auto {

    private String marca;
    private int modelo;
    private float motor;

    enum tipoCombustible {
        GASOLINA, BIETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }

    private tipoCombustible comustible;
    private int numPuertas;
    private int numAsientos;
    private int velMax;

    enum tipoColor {
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIONETA
    }

    private tipoColor color;
    private int velActual;

    public Auto(String marca, int modelo, float motor, tipoCombustible comustible, int numPuertas, int numAsientos,
            int velMax, tipoColor color, int velActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.comustible = comustible;
        this.numPuertas = numPuertas;
        this.numAsientos = numAsientos;
        this.velMax = velMax;
        this.color = color;
        this.velActual = velActual;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return this.modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public float getMotor() {
        return this.motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public tipoCombustible getComustible() {
        return this.comustible;
    }

    public void setComustible(tipoCombustible comustible) {
        this.comustible = comustible;
    }

    public int getnumPuertas() {
        return this.numPuertas;
    }

    public void setnumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumAsientos() {
        return this.numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int getVelMax() {
        return this.velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public tipoColor getColor() {
        return this.color;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public float getVelocidadActual() {
        return this.velActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velActual = velocidadActual;
    }

    public void aceleraAuto(int incrementoVelocidad) {
        if (incrementoVelocidad < 0) {
            System.out.println("aceleraAuto.Error: Valor negativo");
        } else if (velActual + incrementoVelocidad > velMax) {
            System.out.println("aceleraAuto.Error: Se excede la velocidad maxima");
        } else {
            this.velActual += incrementoVelocidad;
        }
    }

    public void desAcelerarAuto(int decrementoVelocidad) {
        if (decrementoVelocidad < 0) {
            System.out.println("desAcelerarAuto.Error: Valor negativo");
        } else if (velActual - decrementoVelocidad < 0) {
            System.out.println("desAcelerarAuto.Error: Resultante negativa");
        } else {
            this.velActual = velActual - decrementoVelocidad;
        }
    }

    public void frenaAuto() {
        this.velActual = 0;
    }

    public float calculaTiempoLlegada(int kmRestantes) {
        return (float) kmRestantes / velActual;
    }

    public void imprimeAuto() {
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(motor);
        System.out.println(comustible);
        System.out.println(numPuertas);
        System.out.println(numAsientos);
        System.out.println(velMax);
        System.out.println(velActual);
        System.out.println(color);
    }
}