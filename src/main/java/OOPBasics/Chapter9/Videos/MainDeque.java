package OOPBasics.Chapter9.Videos;

import java.util.ArrayDeque;
import java.util.Deque;

public class MainDeque {
    public static void main(String[] args) {
        //_ _ _ _ _ _ _ _
        Deque <String> q = new ArrayDeque<>();
        q.offerFirst("Petya");
        System.out.println(q.pollLast());
    }
}
