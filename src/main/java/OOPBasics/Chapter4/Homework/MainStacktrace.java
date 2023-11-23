package OOPBasics.Chapter4.Homework;

import java.util.Scanner;

public class MainStacktrace {
    public static void main(String[] args) {
        PasswordChecker checker = new PasswordChecker();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите минимальную длину пароля: ");
            int minLength = Integer.parseInt(scanner.nextLine());
            checker.setMinLength(minLength);
            System.out.println("Вы ввели: " + minLength);
        } catch (NumberFormatException e) {
            System.out.println("Возможно, Вы ввели не число для minLength. Проверьте ввод данных!");
            return;
        }

        try {
            System.out.println("\nВведите максимальное количество повторений символа подряд: ");
            int maxRepeats = Integer.parseInt(scanner.nextLine());
            checker.setMaxRepeats(maxRepeats);
            System.out.println("Вы ввели: " + maxRepeats);
        } catch (NumberFormatException e) {
            System.out.println("Возможно, Вы ввели не число для maxRepeats. Проверьте ввод данных!");
            return;
        }
        while (true) {
            System.out.println("\nВведите пароль или end: ");
            String password = scanner.nextLine();

            if (password.equals("end")) {
                System.out.println("\nПрограмма завершена!");
                break;
            }
            if (checker.verify(password)) {
                System.out.println("Данный пароль подходит!");
            } else {
                System.out.println("Данный пароль не подходит!");
            }
        }
        scanner.close();
    }
}
