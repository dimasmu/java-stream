package dimas.belajar.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    void testStreamOperation() {
        List<String> buah = List.of("Anggur", "Jeruk", "Nanas");

        Stream<String> streamBuah = buah.stream();
        Stream<String> streamUpper = streamBuah.map(String::toUpperCase);
        streamUpper.forEach(System.out::println);

    }

}
