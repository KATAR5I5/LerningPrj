package Streams;

import java.util.stream.Stream;

public class Concat {
    public static void main(String[] args) {
// фишка его в том, что и не Terminal и не Intermed

    Stream<Integer> stream1 = Stream.of(8,9,67,5);
    Stream<Integer> stream2 = Stream.of(2,3,4);
    Stream<Integer> streamRes = Stream
            .concat(stream1,stream2);

    streamRes.forEach(System.out::println);
// не работает ForEach
//        Stream<Integer> streamRes2 = Stream
//        .concat(stream1,stream2)
//        .forEach(System.out::print);
    }
}
