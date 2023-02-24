package Patterns.Structural.Decorator;

public class TeamLeadDeveloper extends DecoratorDeveloper{
    public TeamLeadDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String writeCode() {
        return super.writeCode() + " + Код который расширяет TeamLead обертка";
    }
}
