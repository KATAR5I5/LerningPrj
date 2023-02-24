package Patterns.Structural.Decorator;

//Структурный паттерн проектирования, который позволяет добавлять
//объектам новую функциональность, оборачивая их в полезные «обёртки».

public class TestDecorator {

    public static void main(String[] args) {

//        без декоратора

        Developer developer2 = new JavaDeveloper();
        System.out.println(developer2.writeCode());

//        с использованием декоратора

        Developer developer = new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println(developer.writeCode());


        Developer developer3 = new SeniorJavaDeveloper(new TeamLeadDeveloper(new JavaDeveloper()));
        System.out.println(developer3.writeCode());
    }
}
