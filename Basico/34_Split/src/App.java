public class App {
    public static void main(String[] args) throws Exception {
        String texto = "Hola Mundo";
        String palabras[] = texto.split(" ");
        for(int i = 0; i< palabras.length; i++){
            System.out.println(palabras[i]);
        }
    }
}
