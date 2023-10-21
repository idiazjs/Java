public class App {
    public static void main(String[] args) throws Exception {
        String[] palabras = { "Fisica", "Espacio", "Tiempo" };
        Articulo articulo = new Articulo("La teoria especial de la relatividad", "Albert Einstein", palabras,
                "Anales de Fisica", 1913,
                "Las leyes de la física son las mismas en todos los sistemas de referencia inerciales.");
        articulo.imprimirArticulo();
    }
}

class Articulo {
    private String nomArticulo;
    private String autorArticulo;
    private String[] palabrasClave = new String[3];
    private String nomPublicacion;
    private int year;
    private String resumen;

    public Articulo(String nomArticulo, String autorArticulo) {
        this.nomArticulo = nomArticulo;
        this.autorArticulo = autorArticulo;
    }

    public Articulo(String nomArticulo, String autorArticulo, String[] palabrasClave, String nomPublicacion, int year) {
        this(nomArticulo, autorArticulo);
        this.palabrasClave = palabrasClave;
        this.nomPublicacion = nomPublicacion;
        this.year = year;
    }

    public Articulo(String nomArticulo, String autorArticulo, String[] palabrasClave, String nomPublicacion, int year,
            String resumen) {
        this(nomArticulo, autorArticulo, palabrasClave, nomPublicacion, year);
        this.resumen = resumen;
    }

    public void imprimirArticulo() {
        System.out.println(nomArticulo);
        System.out.println(autorArticulo);
        for (int i = 0; i < palabrasClave.length; i++) {
            System.out.print(palabrasClave[i]);
            System.out.print(" - ");
        }
        System.out.println();
        System.out.println(nomPublicacion);
        System.out.println(year);
        System.out.println(resumen);
    }

}
