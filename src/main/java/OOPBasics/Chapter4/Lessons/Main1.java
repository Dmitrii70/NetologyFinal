package OOPBasics.Chapter4.Lessons;

public class Main1 {
    public static void main(String[] args) {
            System.out.println(sameLength("Petrov"));


    }

    public static boolean sameLength (String text) {
        String [] parts = text.split(" ");
        if (parts.length != 2) {
            throw new NameInputMismatchException(text);
        }
        String name = parts[1];
        String lastName = parts[0];
        return name.length() == lastName.length();
    }
}
