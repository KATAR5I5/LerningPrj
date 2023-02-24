package Patterns.Structural.Decorator;

public class SeniorJavaDeveloper extends DecoratorDeveloper{

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String writeCode() {
        return super.writeCode() + " + Код который расширяет Senior обертка";
    }
}
