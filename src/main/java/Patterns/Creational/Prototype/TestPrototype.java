package Patterns.Creational.Prototype;

// Порождающий паттерн проектирования, который
// позволяет копировать объекты,
// не вдаваясь в подробности их реализации.

public class TestPrototype {
    public static void main(String[] args) {

        Human woman = new Human("Nataly", 35);

        HumanFactory hf = new HumanFactory(woman);
        Human womanCopy = hf.prototype();
        System.out.println(woman);
        System.out.println("equals - " + woman.equals(womanCopy));
        System.out.println(woman.hashCode() + " vs " + womanCopy.hashCode());

        System.out.println("\n---------------------------------\n");

        Human human = new Human("Andry", 54);
        hf.setHuman(human);
        Human copyHuman = hf.prototype();
        System.out.println(human.hashCode() + " vs " + copyHuman.hashCode());
    }
}
