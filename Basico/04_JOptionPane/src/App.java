import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nombre = "";
        nombre = JOptionPane.showInputDialog(null, "Cual es tu nombre?", nombre, 0);
        System.out.println("Bienvenido " + nombre);
    }
}
