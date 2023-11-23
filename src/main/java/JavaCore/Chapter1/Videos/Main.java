package JavaCore.Chapter1.Videos;

public class Main {
    public static void main(String[] args) {
        Isum summer = new Isum() {
            @Override
            public int sum(int a, int b) {
                return a +b;
            }
        };
        System.out.println(summer.sum(3,2));
    }
}

@FunctionalInterface
interface Isum {
    int sum (int a, int b);
}
