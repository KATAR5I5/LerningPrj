package Patterns.Creational.Prototype;

public class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        setHuman(human);
    }
    void setHuman(Human human){
     this.human = human;
    }
    Human prototype(){
        Human copy = (Human) human.copy();
        return copy;
    }
}
