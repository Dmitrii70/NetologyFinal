package Tester;

public class CommonTester {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        string.append("MOSCOW");
        System.out.println(string.reverse().replace(1,3,"TOMSK"));
    }
}
