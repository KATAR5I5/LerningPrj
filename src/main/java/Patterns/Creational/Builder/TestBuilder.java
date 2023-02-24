package Patterns.Creational.Builder;

//Порождающий паттерн, который позволяет создавать сложные объекты пошагово.
// Строитель даёт возможность использовать один и тот же код строительства для
// получения разных представлений одного объекта.

public class TestBuilder {
//        Builder Simple - реализация

//    1) Создаем класс Builder над Сущностью
//    2) Повторяем все поля сущности
//    3) Для каждого поля создаем Setter-метод с аргументами полей (реализация - присвоение),
//      и возвращаем this объекта builder
//    4) Создаем метод build без аргументов, который возвращает объект сущности
//          Реализация:
//    - создаем объект сущности
//    - устанавливаем полям сущности - значения полей builder-а
//    - return

//        Full Pattern Builder

//    1) Создаем АБСТРАКТНЫЙ класс Builder
//    - Поле класса сущности
//    - метод create сущности (происходит инициализация new Class сущности)
//    - создаем АБСТРАКТНЫЕ build-методы для каждого поля сущности (без реализации!!! - абстрактные)
//    - Создаем get-метод поля сущности
//    2) Создаем Разные Builder классы наследуясь от АБСТРАКТНОГО класса Builder
//    3) Создаем класс Director
//    - создаем поле АБСТРАКТНОГО класса Builder
//    - создаем для АБСТРАКТНОГО поля Set-метод с аргументами (полиморфизм)
//    - Создаем метод build без аргументов, который возвращает объект сущности
//          Реализация:
//    - вызываем все методы на builder
//    - return с помощью builder.get сущность





    public static void main(String[] args) {

//        Builder Simple

        Car car1 = new CarBuilderSimple().build();
        Car car = new CarBuilderSimple()
                .setName("audi")
                .setSpeed(200)
                .build();
        System.out.println("Builder Simple\n---------------------------\n");
        System.out.println(car1);
        System.out.println("Builder Simple 2\n---------------------------\n");
        System.out.println(car);

//        Full Pattern Builder

        Director director = new Director();
        director.setBuilder(new FordCarBuilder());
        Car fordCar = director.buildCar();
        System.out.println(fordCar);

    }
}
