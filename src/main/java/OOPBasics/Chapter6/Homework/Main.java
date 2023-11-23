package OOPBasics.Chapter6.Homework;

import java.util.*;

public class Main {
    public static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        loop:
        while (true) {
            System.out.println("""

                    Выберите операцию:
                    0. Выход из программы
                    1. Добавить дело
                    2. Показать дела
                    3. Удалить дело по номеру
                    4. Удалить дело по названию
                    5. Удалить дело по ключевому слову""");
            try {
                String input = scanner.nextLine();
                number = Integer.parseInt(input);
                switch (number) {
                    case 0:
                        break loop;

                    case 1:
                        System.out.println("Ваш выбор: 1." + "\nВведите название задачи: ");
                        String task = scanner.nextLine();
                        list.add(task);
                        System.out.println("Ваш список дел: ");
                        showCase();
                        break;

                    case 2:
                        System.out.println("Ваш список дел: ");
                        showCase();
                        break;

                    case 3:
                        System.out.println("Введите номер для удаления: ");
                        String removeTask = scanner.nextLine();
                        int remover = Integer.parseInt(removeTask);
                        list.remove(remover - 1);
                        System.out.println("Удалено!");
                        showCase();
                        break;

                    case 4:
                        System.out.println("Введите задачу для удаления: ");
                        String removeText = scanner.nextLine();
                        Iterator<String> iterator = list.iterator();
                        while (iterator.hasNext()) {
                            String s = iterator.next();
                            if (s.equals(removeText)) {
                                iterator.remove();
                            }
                        }
                        showCase();
                        break;

                    case 5:
                        System.out.println("Введите задачу для удаления по ключевому слову: ");
                        removeText = scanner.nextLine();
                        iterator = list.iterator();
                        while (iterator.hasNext()) {
                            String s = iterator.next();
                            if (s.contains(removeText)) {
                                iterator.remove();
                            }
                        }
                        showCase();
                        break;

                    default:
                        System.out.println("Введенное значение должно быть равным 0,1,2,3,4 или 5");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели неправильный тип данных. Попробуйте еще раз.");
            }
        }
    }

    public static void showCase() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}

