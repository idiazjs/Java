import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        ArrayList<Integer> list = new ArrayList<>();
        do {
            num = scan.nextInt();
            if (num != -1) {
                list.add(num);
            }
        } while (num != -1);
        
        System.out.println("Suma: " + Suma(list));
        System.out.println("Suma: + " + SumaPositivos(list));
        System.out.println("Suma: - " + SumaNegativos(list));
        System.out.println("Media " + Media(Suma(list), list.size()));
        System.out.println("Mayor " + Mayor(list));
        System.out.println("Menor " + Menor(list));

        scan.close();
    }

    public static int Suma(ArrayList<Integer> list) {
        int suma = 0;
        for (Integer i : list) {
            suma += i;
        }
        return suma;
    }

    public static int SumaPositivos(ArrayList<Integer> list) {
        int suma = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                suma += list.get(i);
            }
        }
        return suma;
    }

    public static int SumaNegativos(ArrayList<Integer> list) {
        int suma = 0;
        for (Integer i : list) {
            if (i < 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static float Media(float suma, int tam) {
        return suma / tam;
    }

    public static int Mayor(ArrayList<Integer> list) {
        int mayor = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > mayor) {
                mayor = list.get(i);
            }
        }
        return mayor;
    }

    public static int Menor(ArrayList<Integer> list) {
        int menor = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < menor) {
                menor = list.get(i);
            }
        }
        return menor;
    }

}
