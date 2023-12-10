package MultiThread.Lesson1.Hometask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Training {

    private static List<Thread> mThreadList;

    public static void main(String[] args) throws IOException {
        mThreadList = new ArrayList <> ();

        for (int i = 0; i < 10; i++) {
            mThreadList.add(new Thread("Thread #" + i) {
                @Override
                public void run() {
                    System.out.println(getName() + " was activated");
                }
            });
        }

        System.out.println("Threads in list: ");
        for (Thread currentThread : mThreadList) {
            currentThread.start();
            try {
                Thread.sleep(500);
            } catch (Exception exception) {}
        }
    }
}
