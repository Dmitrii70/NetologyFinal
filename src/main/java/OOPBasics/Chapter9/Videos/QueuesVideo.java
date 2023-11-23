package OOPBasics.Chapter9.Videos;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesVideo {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Petya");
        queue.offer("Olya");
        queue.offer("Tanya");
        queue.offer("Aanya");

        queue.remove("Olya");


        while (!queue.isEmpty()) {
            String s = queue.poll();
            System.out.println(s);
        }


    }
}
