package OOPBasics.Chapter8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Petya", 8));
        people.add(new Person("Tanya", 15));
        people.add(new Person("Olya", 8));
        people.add(new Person("Anya", 8));

        System.out.println(people);

        Collections.sort(people,new PersonsNameLengthComparator());
        System.out.println(people);

    }
}
