package Patterns.Lesson1;

import java.util.OptionalInt;

public class PersonBuilder {
    protected String name = null;
    protected String surname = null;
    protected OptionalInt age = OptionalInt.empty();
    protected String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
//        if (age < 0 || age > 200) {
//            throw new IllegalArgumentException("Вы ввели недопустимый возраст");
//        } else {
//            this.age = OptionalInt.of(age);
            return this;
//        }
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
//        if (this.name == null) {
//            throw new IllegalStateException("Вы не ввели имя!");
//        } else if (this.surname == null) {
//            throw new IllegalStateException("Вы не ввели фамилию");
//        }
        return new Person(this);
    }
}