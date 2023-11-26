import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    private static class DateWrapper {
        private LocalDateTime dateTime;
        private DateTimeFormatter formatter;

        public DateWrapper(LocalDateTime dateTime) {
            this.dateTime = dateTime;
        }

        public DateWrapper shortFormat(String format) {
            String pattern="yyyy";
            switch (format) {
                case "standard":
                    pattern = "dd.MM.yyyy' 'HH:mm";
                    break;
                case "full":
                    // не задаём формат
                    break;
                case "only-date":
                    pattern = "dd.MM.yyyy";
                    break;
                case "only-time":
                    pattern = "HH:mm";
                    break;
                default:
                    throw new IllegalArgumentException("Неизвестный формат");
            }
            formatter = DateTimeFormatter.ofPattern(pattern);
            return this;
        }

        public DateWrapper plusDays(int days) {
            dateTime = dateTime.plusDays(days);
            return this;
        }

        public void print() {
            if (formatter == null)
                throw new IllegalStateException("Не задан формат");
            System.out.println(dateTime.format(formatter));
        }
    }

    public static DateWrapper now() {
        return new DateWrapper(LocalDateTime.now());
    }

    public static void main(String[] args) {
        Main.now()
                .plusDays(0)
                .shortFormat("standard")
                .print();
    }
}