import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    clearScreen();
                    LocalTime time = LocalTime.of(i, j, k);
                    String formattedTime = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    System.out.println(formattedTime);
                    Thread.sleep(1000);
                    if (i == 23 && j == 59 && k == 59) {
                        i = 0;
                        j = 0;
                        k = 0;
                    }
                }
            }
        }

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
