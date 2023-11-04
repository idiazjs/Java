public class App {
    public static void main(String[] args) throws Exception {
        Envoltorio envoltorio = new Envoltorio();
        envoltorio.convertirToWrapper();
        envoltorio.convertirToTipoPrimitivo();
        envoltorio.consultarChar();
    }

}

class Envoltorio {
    byte a = 7;
    int b = 100;
    float c = 28.9f;
    double d = 271.8;
    char e = 'M';

    Byte objetoByte;
    Integer objetoInteger;
    Float objetoFloat;
    Double objetoDouble;
    Character objetoChar;

    public void convertirToWrapper() {
        objetoByte = Byte.valueOf(a);
        objetoInteger = Integer.valueOf(b);
        objetoFloat = Float.valueOf(c);
        objetoDouble = Double.valueOf(d);
        objetoChar = Character.valueOf(e);

        System.out.println("Objeto Byte = " + objetoByte);
        System.out.println("Objeto Integer = " + objetoInteger);
        System.out.println("Objeto Float = " + objetoFloat);
        System.out.println("Objeto Double = " + objetoDouble);
        System.out.println("Objeto Character = " + objetoChar);
    }

    public void convertirToTipoPrimitivo() {
        byte tipoByte = objetoByte;
        int tipoInt = objetoInteger;
        float tipoFloat = objetoFloat;
        double tipoDouble = objetoDouble;
        char tipoChar = objetoChar;
        System.out.println("Tipo byte = " + tipoByte);
        System.out.println("Tipo int = " + tipoInt);
        System.out.println("Tipo float = " + tipoFloat);
        System.out.println("Tipo double = " + tipoDouble);
        System.out.println("Tipo char = " + tipoChar);
    }

    public void consultarChar() {
        boolean esMinuscula = Character.isLowerCase(e);
        System.out.println("¿El caracter e = " + e + " esta en minuscula? = " + esMinuscula);
        boolean esMayuscula = Character.isUpperCase(e);
        System.out.println("¿El caracter e = " + e + " esta en mayuscula? = " + esMayuscula);
        boolean esLetra = Character.isLetter(e);
        System.out.println("¿El caracter e = " + e + " esta una letra? = " + esLetra);
        boolean esDigito = Character.isDigit(e);
        System.out.println("¿El caracter e = " + e + " es un dígito? = " + esDigito);
        char charMinuscula = Character.toLowerCase(e);
        System.out.println("Caracter e = " + e + " convertido a minuscula = " + charMinuscula);
    }
}
