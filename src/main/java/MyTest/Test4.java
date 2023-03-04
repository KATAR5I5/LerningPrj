package MyTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) throws IOException {
//        Integer[] ints = new Integer[50];
//        m1(ints);
        Path directory = Path.of("F:\\learn\\Видео курсы\\dmDev");
        String name = renameFileStartWithInAllDirectory(directory,"[Udemy] " );
        System.out.println(name);
    }

    private static String renameFileStartWithInAllDirectory(Path directory,String startWith) throws IOException {


        var listPaths = Files.list(directory)
                .filter(path -> !Files.isDirectory(path))
                .peek(System.out::println)
                .peek(e -> {
                    String name = e.getFileName().toString();
                    if (name.startsWith(startWith)) {
                        String targetName = name.replaceAll("\\[" + startWith.substring(1), "");
                        try {
                            Files.move(e, e.resolveSibling(targetName));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                })
                .collect(Collectors.toList());


//        var s = listPaths.stream()
//                .flatMap(path -> {
//                    try {
//                        return Files.list(path)
//                                .peek(e -> {
//                                    String name = e.getFileName().toString();
//                                    if (name.startsWith("[SW.BAND] ")) {
//                                        String targetName = name.replaceAll("\\[SW.BAND\\] ", "");
//                                        try {
//                                            Files.move(e, e.resolveSibling(targetName));
//                                        } catch (IOException ex) {
//                                            throw new RuntimeException(ex);
//                                        }
//                                    }
//                                });
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                })
//
//
//                .collect(Collectors.toList());
//        System.out.println(s);

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
