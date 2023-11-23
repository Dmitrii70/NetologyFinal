package Tester.Enumeration;

public class VeryStrictDiet {
    public void takeLunch (DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case SUNDAY:
                System.out.println("Вщскресный обед! Сегодня можно даже немного сладкого");
                break;
            case MONDAY:
                System.out.println("Обед для понедельника: куриная лапша!");
                break;
            case TUESDAY:
                System.out.println("Вторник, сегодня суп из сельдерея");
                break;
        }
    }
}
