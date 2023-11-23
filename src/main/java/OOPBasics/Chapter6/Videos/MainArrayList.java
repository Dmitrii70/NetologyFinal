package OOPBasics.Chapter6.Videos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Petya");
        list.add("Olya");
        list.add("Tanya");

        for (int i = 0; i < list.size();i++) {
            System.out.println(list.get(i));
        }
        for (String s : list) {
            System.out.println(s);
        }
        Iterator <String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println(list.get(1));
    }
}
