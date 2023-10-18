public class App {
    public static void main(String[] args) throws Exception {
        Message message = new Message();
        message.getMessage();
        message.setMessage("uwu");
    }

}
// Clase que representa un mensaje
class Message {
    private String message;

    public synchronized void setMessage(String message) {
        while (this.message != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.message = message;
        notifyAll();
    }

    public synchronized String getMessage() {
        while (this.message == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String message = this.message;
        this.message = null;
        notifyAll();
        return message;
    }
}