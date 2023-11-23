package Tester.JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaCollections {
    public static void main(String[] args) {
        String mercury = "Меркурий";
        String venus = "Венера";
        String earth = "Земля";
        String mars = "Марс";
        String jupiter = "Юпитер";
        String saturn = "Сатурн";
        String uran = "Уран";
        String neptune = "Нептун";

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, uran, neptune));
        Collections.sort(solarSystem);
        System.out.println(solarSystem);
        Collections.reverse(solarSystem);
        System.out.println(solarSystem);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));

        ArrayList<Integer> lottery = new ArrayList<>(100);
        for (int i = 1; i <=100; i++) {
            lottery.add(i);// Добавление чисел в пустые ячейки ArrayList (в количестве 100 штук).
        }
        Collections.shuffle(lottery);//Перемешивание чисел.
        System.out.println("Внимание! Из барабана появляются первые 10 чисел!");
        for (int i = 0; i < 10; i++) {
            System.out.println(lottery.get(i));
        }
        Collections.swap(solarSystem, solarSystem.indexOf(mercury),solarSystem.indexOf(neptune));
        System.out.println(solarSystem);
    }
}
