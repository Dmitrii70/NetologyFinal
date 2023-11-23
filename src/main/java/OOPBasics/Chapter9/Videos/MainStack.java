package OOPBasics.Chapter9.Videos;

import java.util.ArrayDeque;
import java.util.Deque;

public class MainStack {
    public static void main(String[] args) {
//        Stack <String> s = new Stack<>();//Значения выводятся как в реальной стопке
//        Java рекомендует следующую реализаию:
        Deque<String> s = new ArrayDeque<>();
        s.push("Petya");
        s.push("Olya");
        s.push("Tanya");

//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());

        while (!s.isEmpty()) {
            String name = s.pop();
            System.out.println(name);
        }
    }
}
