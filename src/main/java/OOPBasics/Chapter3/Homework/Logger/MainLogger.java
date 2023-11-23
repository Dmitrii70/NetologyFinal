package OOPBasics.Chapter3.Homework.Logger;

public class MainLogger {
    public static void main(String[] args) {
        Logger simpleLogger = new SimpleLogger();
        Logger smartLogger = new SmartLogger();

        simpleLogger.log("Текущие дата и время составляют: ");
        smartLogger.log("Error");
        smartLogger.log("ERROR");
        smartLogger.log("error");
        smartLogger.log("Noterror");
        smartLogger.log("err");


    }
}
