package Patterns.Structural.Adapter;

// Структурный паттерн проектирования,
// который позволяет объектам с несовместимыми интерфейсами работать вместе.

public class AdapterTest {
    public static void main(String[] args) {
    Database database = new AdapterJavaDatabase();

    database.create();
    database.read();
    database.update();
    database.delete();
    }
}
