package JavaCore.Chapter1.Videos;

import java.util.function.*;

public class Tester {
    public static void main(String[] args) {
        // Проверяет соблюдение некоего условия.
        Predicate<Integer> isPositive = x -> x >= 0;
        System.out.println(isPositive.test(5));

        // Переход от одного типа к другому.
        Function <Integer, String> convert = x -> x + " долларов";
        System.out.println(convert.apply(5));

        //Выполняет некоторое действие над объектом не возвращая его
        Consumer <Integer> printer = x -> System.out.printf("%d долларов \n", x);
        printer.accept(600);

        // Не принимает аргументов, но возвращает объект типа T.
        Supplier <String> stringFactory = () -> "new";
        String str = stringFactory.get();
        System.out.println(str);

        /* Принимает в качестве параметра объект типа Т, выполняет над ним операции и возвращает результат операции
           в виде объекта типа Т.*/
        UnaryOperator <Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        /* Принимает в качестве параметра два объекта типа Т, выполняет над ними бинарну
        операцию и возвращает результат операции в виде объекта типа Т.*/
        BinaryOperator <Integer> multiply = (x,y) -> x * y;
        System.out.println(multiply.apply(3,5));

    }
}

