package Algorithms.Chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheoryMain {
    public static void main(String[] args) {

        System.out.println(factorial(15) + "!");
        try {
            System.out.println(calculate(4, 10));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        List <Integer> list = Arrays.asList(100, 200, 300, 400, 500, 600, 700);
        System.out.println(list.get(1));
    }

    private static long factorial(int n) {
        long result = 1;
        if (n == 0) {
            System.out.println(" = ");
            return result;
        }
        if (n == 1) {
            System.out.println(" * 1 = ");
            return result;
        }

        System.out.println(n);
        if(n != 2) {
            System.out.println(" * ");
        }

        result = n * factorial(n-1);
        return result;
    }

    private static double calculate(int x, int n) throws ArithmeticException {
        if (x ==0 && n == 0) {
            throw new ArithmeticException("Невалидные входные данные: Неопределенность типа 0^0");
        }
        if (n < 0) {
            throw new ArithmeticException("Невалидные входные данные: Факториал из отрицательного числа!");
        }
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        return power (x,n) / n;
    }

    private static double power(int x, int n) {
        if (n ==1 ) {
            return x;
        }
        return x * calculate(x, n -1);
    }

}
