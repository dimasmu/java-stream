package dimas.belajar.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {
    // operasi intermediate bekerja secara lazy salah satunya adalah map.
    // sehingga sout tidak muncul untuk mentrigger. supaya intermediate operation berjalan yaitu dengan foreach(salah satu terminal operation)
    // salah satu ciri terminal operation adalah return void pada method nya
    @Test
    void testIntermediateOperation() {
        List<String> names = List.of("Budi", "Hartono");
        Stream<String> upper = names.stream().map(name -> {
            System.out.println("Change " + name + " to uppercase");
            return name.toUpperCase();
        });
    }

    @Test
    void testTerminalOperation() {

        List<String> names = List.of("Budi", "Hartono");
        names.stream().map(name -> {
            System.out.println("Change " + name + " to uppercase");
            return name.toUpperCase();
        }).forEach(System.out::println);
    }

}
