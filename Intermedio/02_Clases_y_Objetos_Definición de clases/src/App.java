public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("Pedro", "Pérez", "1053121010", 1998);
        Persona persona2 = new Persona("Luis", "León", "1053223344", 2001);
        persona1.Imprime();
        persona2.Imprime();
    }

}

class Persona {
    String nombre;
    String apellido;
    String numDocIdent;
    int anioNace;

    Persona(String nombre, String apellido, String numDocIdent, int anioNace) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numDocIdent = numDocIdent;
        this.anioNace = anioNace;
    }

    void Imprime() {
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(numDocIdent);
        System.out.println(anioNace);
    }
}