package OOPBasics.Chapter7.Videos3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Petya", 8);
        map.put("Tanya", 15);
        int age = map.get("Tanya");

    }
}
