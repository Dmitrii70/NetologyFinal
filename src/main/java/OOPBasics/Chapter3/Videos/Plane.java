package OOPBasics.Chapter3.Videos;

public class Plane extends Transport{
    public Plane() {
        super(10_000);
    }

    @Override
    public void transfer (String name, String from, String to) {
        System.out.println(name + " полетел из " + from + " в " + to);
        spendFuel(300);
    }

}
