package OOPBasics.Chapter6.Videos;
import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("Petya");
        list.add("Olya");
        list.add("Tanya");
        System.out.println(list.get(1));

    }
}
