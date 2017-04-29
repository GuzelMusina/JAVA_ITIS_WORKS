package ru.itis;

import java.util.Objects;

public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Human && o != null) {
            Human that = (Human)o;
            return this.name.equals(that.name) &&
                    this.age == that.age;
        } else return false;
    }

    @Override
    public int hashCode() {
        // return this.name.hashCode() + age;
        return Objects.hash(this.name, this.age);
    }
}
