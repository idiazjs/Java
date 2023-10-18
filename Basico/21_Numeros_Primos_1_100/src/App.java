public class App {
    public static void main(String[] args) throws Exception {
        boolean esPrimo;
        for (int i = 2; i < 100; i++) {
            esPrimo = true;
            forvalidacion:
            for (int j = (int) Math.sqrt(i); j > 1; j--) {
                if (i % j == 0) {
                    esPrimo = false;
                    break forvalidacion;
                }
            }
            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}