public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 100; i++){
            if(i%2 == 0){
                System.out.println("%2: " + i);
            }
            if(i%3 == 0){
                System.out.println("%3: " + i);
            }
        }
    }
}
