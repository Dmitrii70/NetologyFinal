package OOPBasics.Chapter8;

public class Person implements Comparable<Person> {
    protected String name;
    protected int age;


    public Person(String name, int age) {
        this.age = age;
        this.name = name;

    }

    @Override
    public int compareTo(Person o) {
        if (age < o.age) {
            return -1;
        } else if (age > o.age) {
            return 1;
        } else {
            return name.compareTo(o.name);
        }
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
