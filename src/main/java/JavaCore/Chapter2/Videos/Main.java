package JavaCore.Chapter2.Videos;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
//        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        List<String> list = Arrays.asList("one", "two", "three");

        boolean anyMatch = list.stream()
                .anyMatch(value -> value.startsWith("o"));
        System.out.println(anyMatch);

        List<String> uppercaseList = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseList);

        List<String> list1 = new ArrayList<>();
        list1.add("И долго буду тем любезен я народу");
        list1.add("Что чувства добрые я лирой пробуждал");
        list1.add("Что в мой жестокий век восславил я Свободу");
        list1.add("И милость к падшим призывал");

        long count = list1.stream()
                .flatMap(value -> Arrays.stream(value.split(" ")))
                .count();
        System.out.println(count);

        List<String> strings = Arrays.asList("JavaScript", "Java 8", "Java 11", "Android", "Spring");

        Optional<String> result = strings.parallelStream()
                .filter(s -> s.contains("Java"))
                .findFirst();

        result.ifPresentOrElse(System.out::println,() -> System.out.println("There is no Java")
                );
        List<Integer> intList = Arrays.asList(1,2,5,10);
        Optional<Integer> min = intList.stream().min(Integer::compareTo);
        if (min.isPresent()) {
            Integer minString = min.get();
            System.out.println(minString);
        }
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");

        Optional<String> reduced = stringList.stream()
                .reduce((value, combinedValue) -> combinedValue + " + " + value);
        reduced.ifPresent(System.out::println);

        Stream<String> stream = stringList.stream();
        Object[] objects = stream.toArray();
    }
}
