package Patterns.Lesson1;

public class PersonBuilder {
    protected String name = null;
    protected String surname = null;
    protected int age;
    protected String city;


    public PersonBuilder setName(String name) {
        if (name == null) {
            throw new IllegalStateException("Вы не ввели имя");
        } else {
            this.name = name;
            return this;
        }
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null) {
            throw new IllegalStateException("Вы не ввели фамилию");
        } else {
            this.surname = surname;
            return this;
        }
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 200) {
            throw new IllegalArgumentException("Вы ввели недопустимый возраст");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (this.name == null) {
            throw new IllegalStateException("Вы не ввели имя!");
        } else if (this.surname == null) {
            throw new IllegalStateException("Вы не ввели фамилию");
        }
        return new Person(this);
    }
}