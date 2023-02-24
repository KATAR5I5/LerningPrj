package MyTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) throws IOException {
//        Integer[] ints = new Integer[50];
//        m1(ints);
        Path directory = Path.of("C:\\Users\\User\\Downloads\\Stream API Lection");
        String name = getFileNameMAxWeight(directory);
        System.out.println(name);
    }

    private static String getFileNameMAxWeight(Path directory) throws IOException {
        var s = Files.list(directory)
                .filter(path -> !Files.isDirectory(path))
//                .peek(System.out::println)
//                .max((e1, e2) -> {
//                    try {
//                        return Long.compare(Files.size(e1), Files.size(e2));
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                })
//                .get();
                .peek(e -> {
                    String name = e.getFileName().toString();
                    if (name.contains("Stream API. Часть ")) {
                        String targetName = name.replaceAll("Stream API. Часть ", "");
                        try {
                            Files.move(e, e.resolveSibling(targetName));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                })

                .collect(Collectors.toList());
        System.out.println(s);

        return null;
    }

    static void m1(Integer[] ints) {
        Arrays.asList(ints).stream()
                .filter(Objects::nonNull)
                .peek(e -> e.toString())
                .collect(Collectors.toList());
    }

    static Map<Character, Integer> method2(String str) {
        Map<Character, Integer> res = new HashMap<>();
        var result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(e -> (int) e));
        return null;
    }


}
