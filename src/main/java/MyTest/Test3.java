package MyTest;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] integers = new int[]{2, 4, 0, 100, 4, 11, 2602, 36};
        int[] integers2 = new int[]{160, 3, 1719, 19, 11, 13, -21};
        System.out.println(method(integers, 4));
        System.out.println(method2(integers, 4));
        System.out.println(find(integers));
        System.out.println(find2(integers2));
    }

    static boolean method(int[] array, int x) {

        for (int el : array) {
            if (el == x) {
                return true;
            }
        }
        return false;
    }

    static boolean method2(int[] array, int x) {
        return Arrays.stream(array)
//                .filter(e->e==x)
                .anyMatch(e -> e == x);
    }


    static int find(int[] integers) {
        if (integers[0] % 2 == integers[1] % 2) {
            if (integers[0] % 2 == 0) {
                return Arrays.stream(integers)
                        .filter(el -> el % 2 != 0)
                        .findFirst().getAsInt();
            } else
                return Arrays.stream(integers)
                        .filter(el -> el % 2 == 0)
                        .findFirst().getAsInt();
        } else {
            return integers[0] % 2 == integers[2] % 2 ? integers[1] : integers[0];
        }
    }

    static int find2(int[] integers) {
        if (integers[0] % 2 == integers[1] % 2) {
            if (integers[0] % 2 == 0) {
                for (int e : integers) {
                    if (e % 2 != 0) return e;
                }
            } else {
                for (int e : integers) {
                    if (e % 2 == 0) return e;
                }
            }
        } else
            return integers[0] % 2 == integers[2] % 2 ? integers[1] : integers[0];

        return 0;
    }
}