package Patterns.Lesson1;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = 0;
    protected String city = null;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    protected Person(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.city = builder.city;
    }


    public boolean hasAge(int age) {
        if (age == 0) {
            return false;
        }
        return true;
    }

    public boolean hasAddress() {
        if (city == null) {
            return false;
        }
        return true;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

//    public int getAge() {
//        return age;
//
//    }

    public String getAddress() {
        return city;
    }

    public void setAddress(String city) {
        this.city = city;
    }

    public void happyBirthday() {
        age++;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder();
    }
}
