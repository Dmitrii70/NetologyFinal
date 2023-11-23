package OOPBasics.Chapter5;

public class Main {
    public static void main(String[] args) {
        Memory<String> memory = new Memory<String>();
        memory.save("Petya");
        memory.save("Olya");
        memory.save("Tanya");
        String value = memory.getLast();
        System.out.println(value);

        String v1 = "Petya";
        String v2 = "Olya";
        String result = choose(true, v1, v2);
    }


    public static <T> T choose(boolean flag, T first, T second) {
        if (flag) {
            return first;
        } else {
            return second;
        }
    }
}
