package Patterns.Structural.Decorator;

public class DecoratorDeveloper implements Developer{
    Developer developer;

    public DecoratorDeveloper(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String writeCode() {
        return developer.writeCode();
    }
}
