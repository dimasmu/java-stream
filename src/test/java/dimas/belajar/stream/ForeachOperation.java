package dimas.belajar.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForeachOperation {

    @Test
    void testPeek() {

        List.of("Budi", "Roni", "Diki", "Mukidi").stream()
                .peek(name -> System.out.println("Before change to upper '" + name + "'"))
                .map(String::toUpperCase)
                .peek(name -> System.out.println("After change to upper '" + name + "'"))
                .forEach(System.out::println);

    }

}
