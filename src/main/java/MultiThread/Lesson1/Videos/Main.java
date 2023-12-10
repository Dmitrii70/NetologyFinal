package MultiThread.Lesson1.Videos;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable logic = () -> {
            for (int i = 0; i < 30; i++) {
                System.out.println("Hello from the Thread");
            }
        };

        Thread thread = new Thread(logic);
        thread.start();

        for (int i = 0; i < 30; i++) {
            System.out.println("Hello from main");
        }
    }
}
