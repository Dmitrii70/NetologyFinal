package OOPBasics.Chapter8;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainBinary {
    public static void main(String[] args) {
        Map <String, Integer> map = new TreeMap<>();
        map.put("Petya", 8);
        map.put("Olya", 15);
        int age = map.get("Petya");
        System.out.println(age);
        Set <String> set = new TreeSet<>();
        set.add("Petya");
        set.add("Olya");
        set.add("Petya");
        System.out.println(set);
    }
}
