package OOPBasics.Chapter7.Hometask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Address, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(new Address("Russia", "Moscow"), 100);
        costPerAddress.put(new Address("Russia", "Saint Petersburg"), 200);
        costPerAddress.put(new Address("Russia", "Tomsk"), 300);
        costPerAddress.put(new Address("The United States", "New York"), 100);
        costPerAddress.put(new Address("Kyrgyzstan", "Bishkek"), 100);
        costPerAddress.put(new Address("Czech Republic", "Prague"), 250);
        costPerAddress.put(new Address("Spain", "Barcelona"), 500);

        Scanner scanner = new Scanner(System.in);
        int totalPrice = 0;
        Set<String> countries = new HashSet<>();
        while (true) {
            System.out.println("\nЗАПОЛНЕНИЕ НОВОГО ЗАКАЗА");
            System.out.println("Введите страну: ");
            String country = scanner.nextLine();
            if ("end".equals(country)) {
                break;
            }
            System.out.println("\nВведите город: ");
            String city = scanner.nextLine();
            System.out.println("\nВведите вес (кг): ");
            int weight = Integer.parseInt(scanner.nextLine());

            Address address = new Address(country, city);

            if (costPerAddress.containsKey(address)) {
                int currentPrice = costPerAddress.get(address) * weight;
                totalPrice += currentPrice;
                countries.add(country);
                System.out.printf("\nСтоимость доставки составит: %d руб.", currentPrice);
                System.out.printf("\nОбщая стоимость всех доставок составит: %d руб.", totalPrice);
                System.out.printf("\nДоставки были в %d стран/страну", countries.size());
            } else {
                System.out.println("Доставки по этому адресу нет!");
            }

        }
    }
}
