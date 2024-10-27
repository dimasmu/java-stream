package dimas.belajar.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
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

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> stringCollection = List.of("Hari", "ini", "hujan");
        Stream<String> stringStream = stringCollection.stream();
        stringStream.forEach(System.out::println);

//      jika stream telah di alirkan lalu dialirkan kembali maka akan terdapat error
//      stringStream.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {

//      infinte loop
        Stream<String> stream = Stream.generate(() -> "Programmer JAVA");
//        stream.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
//        iterate.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("KUE");
        builder.add("BOLU").add("COKLAT");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilder2() {
        Stream<Object> stream = Stream.builder().add("KUE").add("BOLU").add("COKLAT").build();
        stream.forEach(System.out::println);
    }


}
