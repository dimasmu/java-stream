package dimas.belajar.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipeLineTest {


    @Test
    void testCreateStreamPipeline1() {
        // JARANG DIGUNAKAN CARA SEPERTI INI
        List<String> list = List.of("Eko", "Kurniawan", "Khannedy");

        Stream<String> stream = list.stream();

        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());

        Stream<String> streamMr = streamUpper.map(upper -> "Mr." + upper);

        streamMr.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipeLine2(){

        List<String> sayur = List.of("Brokoli", "Bayam", "Lodeh");

        sayur.stream().map(String::toUpperCase).map(name2 -> "Sayur "+ name2).forEach(System.out::println);

    }

}
