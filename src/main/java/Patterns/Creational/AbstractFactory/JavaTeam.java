package Patterns.Creational.AbstractFactory;

public class JavaTeam implements DeveloperTeam{
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new JavaTester();
    }
}
