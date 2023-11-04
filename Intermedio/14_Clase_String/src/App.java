public class App {
    public static void main(String[] args) throws Exception {
        String text = " Programacion Orientada a Objetos ";
        System.out.println(text.length());
        text = text.trim();
        System.out.println(text);
        text = text.toUpperCase();
        System.out.println(text);
        text = text.concat("1234");
        System.out.println(text);
        text = text.substring(10, 15);
        System.out.println(text);
        text = text.replace("O", "o");
        System.out.println(text);
        System.out.println(text.equals("Programacion"));
        cuentaMayus(text);
        calculaApariciones(text, 'O');
        eliminaEspacios(text);
        invierteString(text);
    }

    // Cuenta el total de mayusculas
    public static void cuentaMayus(String x) {
        char c;
        int cont = 0;
        for (int i = 0; i < x.length(); i++) {
            c = x.charAt(i);
            if (Character.isUpperCase(c)) {
                cont += 1;
            }
        }
        System.out.println(cont);
    }

    public static void calculaApariciones(String text, char c) {
        text = text.toLowerCase();
        c = Character.toLowerCase(c);
        int cont = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                cont += 1;
            }
        }
        System.out.println(cont);
    }

    public static void eliminaEspacios(String text) {
        char c = ' ';
        String nuevoString = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != c) {
                nuevoString += String.valueOf(text.charAt(i));
            }
        }
        System.out.println(nuevoString);
    }

    public static void invierteString(String text) {
        String nuevoString = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            nuevoString += String.valueOf(text.charAt(i));
        }
        System.out.println(nuevoString);
    }

}
