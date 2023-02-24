package Patterns.Creational.Prototype;

import java.util.Objects;

public class Human implements Copyable {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public Object copy() {
        Human copy = new Human(name,age);
        return copy;
    }














    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name);
    }

}
