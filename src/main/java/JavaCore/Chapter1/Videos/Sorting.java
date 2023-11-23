package JavaCore.Chapter1.Videos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Мадрид", "Париж", "Москва", "Токио");
        Collections.sort(cities, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        Collections.sort(cities, (a, b) -> b.compareTo(a));

        OnDoneListener listener = v -> System.out.println(v);
        Test test = new Test(listener);
        test.execute();
    }
}

@FunctionalInterface
interface OnDoneListener<T> {
    void onDone(T v);
}
