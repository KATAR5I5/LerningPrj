package Patterns.Creational.AbstractFactory;

//Порождающий паттерн проектирования, который
// представляет собой интерфейс для создания
// других классов, не привязываясь к конкретным классам создаваемых объектов.

public class TestAbstractFactory {
//    создать interface команду (группа методов кот возвращают объекты интерфейсов)
//    задать всем исполнителям реализацию

public static void main(String[] args) {

    DeveloperTeam javaTeam = new JavaTeam();
    Developer developer = javaTeam.getDeveloper();
    Tester tester =javaTeam.getTester();
    developer.develop();
    tester.testing();
}
}
