package OOPBasics.Chapter9.Videos;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTester {
    public static void main(String[] args) {
        Queue <String> q = new LinkedList<>();
        q.offer("Petya");
        q.offer("Alex");
        q.offer("Vasya");
        System.out.println(q.size());

    }
}
