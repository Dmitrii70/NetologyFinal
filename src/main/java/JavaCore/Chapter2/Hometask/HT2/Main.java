package JavaCore.Chapter2.Hometask.HT2;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }

//      1) Расчет числа несовершеннолетних (до 18 лет) среди жителей города в 10 млн. человек.

        int under18 = (int) persons.stream().filter(age -> age.getAge() < 18).count();
        System.out.println(under18);

//      2) Получение списка призывников (мужчины от 18 до 27 лет) среди жителей города в 10 млн. человек.

        List<String> listOfRecruits = persons.stream()
                .filter(sex -> sex.getSex() == Sex.MAN)
                .filter(age -> age.getAge() >= 18)
                .filter(age -> age.getAge() <= 27)
                .map(Person::getFamily)
                .collect(Collectors.toList());

        System.out.println(listOfRecruits);

//      3) Получение отсортированного по фамилии списка потенциально работоспособных людей
//         с высшим образованием (Мужчины 18-65, женщины 18-60).

        List<String> listOfEmployables = persons.stream()
                .filter(person -> person.getEducation() == Education.HIGHER)
                .filter(person -> person.getAge() >= 18)
                .filter(person -> person.getSex() == Sex.WOMAN ? person.getAge() <= 60 : person.getAge() <= 65)
                .sorted(Comparator.comparing(Person::getFamily))
                .map(Person::getFamily)
                .collect(Collectors.toList());

        System.out.println(listOfEmployables);
    }
}
