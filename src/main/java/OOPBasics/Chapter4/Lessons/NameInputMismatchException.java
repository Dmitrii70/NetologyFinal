package OOPBasics.Chapter4.Lessons;

public class NameInputMismatchException extends RuntimeException{
    public NameInputMismatchException(String text) {
        super("В параметре необходимо указать имя и фамилию, но было указано: " + text);
    }
}
