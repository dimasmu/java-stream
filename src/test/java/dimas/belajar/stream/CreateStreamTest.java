package dimas.belajar.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> {
            System.out.println(data);
        });

        Stream<String> oneStream = Stream.of("Budi");
        oneStream.forEach(data -> {
            System.out.println(data);
        });

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(item -> {
            System.out.println(item);
        });
    }

    @Test
    void testCreateStreamFromArray() {

        Stream<String> arrayStream = Stream.of("Budi", "Bermain", "Bola");
        arrayStream.forEach(name -> System.out.println(name));

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        integerStream.forEach(name -> System.out.println(name));

        String[] array = new String[]{"Budi", "Bermain", "Bola"};

        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(name -> System.out.println(name));

    }

}
