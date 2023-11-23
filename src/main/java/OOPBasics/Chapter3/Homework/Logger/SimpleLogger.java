package OOPBasics.Chapter3.Homework.Logger;

import java.time.LocalDateTime;

public class SimpleLogger implements Logger {

    @Override
    public void log(String msg) {
        System.out.printf("%s %s%n", msg, LocalDateTime.now());
    }
}
