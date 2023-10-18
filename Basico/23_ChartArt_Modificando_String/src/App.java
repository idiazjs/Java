public class App {
    public static void main(String[] args) throws Exception {
        String texto = "La lluvia en Sevilla es una maravilla";
        String nuevoTexto = "";
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i)=='a'){
                nuevoTexto += "e";
            }else{
                nuevoTexto += texto.charAt(i);
            }
        }
        System.out.println(nuevoTexto);
    }
}