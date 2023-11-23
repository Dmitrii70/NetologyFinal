package OOPBasics.RazborZadach;

public class Candidate {
    private String name;
    private int experience;
    private int age;

    public Candidate(String name, int age, int experience) {
        this.name = name;
        this.experience = experience;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getAge() {
        return age;
    }
}
