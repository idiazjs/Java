public class App {
    public static void main(String[] args) throws Exception {
        String texto = "La lluvia en Sevilla es una maravilla";
        char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            // System.out.println(texto.charAt(i));
            for_char: for (int j = 0; j < vocales.length; j++) {
                if (texto.charAt(i) == vocales[j]) {
                    contador += 1;
                    break for_char;
                }
            }
        }
        System.out.println(contador);
    }
}