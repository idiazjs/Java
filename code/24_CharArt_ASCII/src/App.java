public class App {
    public static void main(String[] args) throws Exception {
        String texto = "La lluvia en Sevilla es una maravilla";
        String ascciTexto = "";
        for (int i = 0; i < texto.length(); i++) {
            int x = (int)texto.charAt(i);
            ascciTexto += x;
            if(i != texto.length()-1){
                ascciTexto += ",";
            }
        }
        System.out.println(ascciTexto);
    }
}
