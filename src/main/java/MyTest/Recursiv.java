package MyTest;

public class Recursiv {
    public static void main(String[] args) {
        System.out.println(sum(10000));
    }

    private static int sum(int i) {
        if (i == 1) return 1;
        int summa = i + sum(--i);
        return summa;

    }
}
