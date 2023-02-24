package Generics;

public class Parametrized {
    public static void main(String[] args) {
        Info<Integer> info = new Info<>(5,8);
        info.showInfo();
        Info<String> infoString = new Info<>("Hi","OK");
        infoString.showInfo();
        new Info<Integer>(1,3).showInfo();
        System.out.println(new Info<Integer>(4,7));
    }
}


class Info<T> {
    private T value1;
    private T value2;

    public Info(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    void showInfo(){
        System.out.println("{"+value1+"}"+"\n{"+value2+"}");
    }

    @Override
    public String toString() {
        return "Info{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}