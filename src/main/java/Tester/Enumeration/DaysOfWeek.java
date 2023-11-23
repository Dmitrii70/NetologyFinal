package Tester.Enumeration;

public class DaysOfWeek {
    private String title;
    public DaysOfWeek(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = new DaysOfWeek("Суббота");
        System.out.println(daysOfWeek);
    }

        @Override
        public String toString() {
            return  "DayOfWeek{" +
                    "title='" + title + '\'' +
                    '}';
        }
}
