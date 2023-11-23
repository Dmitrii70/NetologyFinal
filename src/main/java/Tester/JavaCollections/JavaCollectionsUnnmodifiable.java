package Tester.JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaCollectionsUnnmodifiable {
    public static void main(String[] args) {
        try {
            String mercury = "Меркурий";
            String venus = "Венера";
            String earth = "Земля";
            String mars = "Марс";
            String jupiter = "Юпитер";
            String saturn = "Сатурн";
            String uran = "Уран";
            String neptune = "Нептун";

            List<String> solarSystem = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus,
                    earth, mars, jupiter, saturn, uran, neptune)));
            solarSystem.add("Плутон");
        } catch (UnsupportedOperationException e) {
            System.out.println("Вы пытаетесь добавить значение в неизменяемый ArrayList!");
        }
    }
}
