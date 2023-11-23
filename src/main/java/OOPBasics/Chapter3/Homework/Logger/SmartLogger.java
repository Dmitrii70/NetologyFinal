package OOPBasics.Chapter3.Homework.Logger;

import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    protected int orderNumber = 0;

    @Override
    public void log(String msg) {
        orderNumber++;
        System.out.printf("%s#%d [%s] %s%n",
                (msg.toLowerCase().contains("error")) ? "ERROR" : "INFO",
                orderNumber,
                LocalDateTime.now(),
                msg);
    }
}
