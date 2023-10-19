public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo(10);
        System.out.println(circulo.area());
        System.out.println(circulo.perimetro());
        Cuadrado cuadrado = new Cuadrado(10);
        System.out.println(cuadrado.area());
        System.out.println(cuadrado.perimetro());
        Rectangulo rectangulo = new Rectangulo(10, 5);
        System.out.println(rectangulo.area());
        System.out.println(rectangulo.perimetro());
        Triangulo equilatero = new Triangulo(3, 2.5980);
        System.out.println(equilatero.area());
        System.out.println(equilatero.perimetro());
        System.out.println(equilatero.calcularHipotenusa());
        System.out.println(equilatero.determinarTipoTriangulo());

        Triangulo escaleno = new Triangulo(3, 4);
        System.out.println(escaleno.determinarTipoTriangulo());
        escaleno.determinarTipoTriangulo();

        Triangulo isosceles = new Triangulo(3, 3);
        System.out.println(isosceles.determinarTipoTriangulo());
    }
}

class Circulo {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return this.radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * (Math.pow(radio, 2));
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}

class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return base * 2 + altura * 2;
    }

}

class Cuadrado {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return this.lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int area() {
        return lado * lado;
    }

    public int perimetro() {
        return lado * 4;
    }
}

class Triangulo {
    private int base;
    private double altura;

    public Triangulo(int base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float area() {
        return (float) (base * altura) / 2;
    }

    public double perimetro() {
        if (determinarTipoTriangulo() == "Equilatero") {
            return (double) base * 3;
        } else {
            return base + altura + calcularHipotenusa();
        }
    }

    double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    String determinarTipoTriangulo() {
        double calculaAltura = Math.round(((base * Math.sqrt(3)) / 2) * 100.0) / 100.0;
        if (calculaAltura == Math.round(altura * 100.0) / 100.0)
            return "Equilatero;";
        else if ((base != altura) && (calcularHipotenusa() != base) &&
                (calcularHipotenusa() != altura))
            return "Escaleno;";
        else
            return "Isosceles;";
    }
}