package Generics;

public class Parametrized2 {
    public static void main(String[] args) {
        Info2<Integer> info2 = new Info2<>(5, 8);
        info2.showInfo();

        Info3<String> infoString = new Info3<>("Hi", "OK");
        infoString.showInfo();

        new Info<Integer>(1, 3).showInfo();
        System.out.println(new Info<Integer>(4, 7));
    }
}


class Info2<T extends Number> {
    private T value1;
    private T value2;

    public Info2(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    void showInfo() {
        System.out.println("{" + value1 + "}" + "\n{" + value2 + "}\n");
    }
}

class Info3<T extends String> {
    private T value1;
    private T value2;

    public Info3(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    void showInfo() {
        System.out.println("{" + value1 + "}" + "\n{" + value2 + "}\n");
    }
}
