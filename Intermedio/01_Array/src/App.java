public class App {
    public static void main(String[] args) throws Exception {
        int[] arrayInt = { 4, 1, 2, 3, 3, 4, 4, 5, 2 };
        boolean numValidado;

        //  int[] arrayInt2;
        //  arrayInt2 = new int [10];

        for (int i = 0; i < arrayInt.length; i++) {
            numValidado = false;
            for (int j = i - 1; j >= 0; j--) {
                if (arrayInt[i] == arrayInt[j]) {
                    numValidado = true;
                }
            }
            if (numValidado == false) {
                for (int j = i + 1; j < arrayInt.length; j++) {
                    if (arrayInt[i] == arrayInt[j]) {
                        System.out.print(
                                "El numero " + arrayInt[i] + "[" + i + "]");
                        System.out.println(" se encuentra en la posision " + j);
                    }
                }
            }
        }

    }
}
