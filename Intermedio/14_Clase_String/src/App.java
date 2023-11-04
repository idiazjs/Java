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
    }
}
