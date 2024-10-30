package dimas.belajar.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {

    @Test
    void testFilter() {

//      Mencari nama yang panjang kalimatnya lebih besar dari 4
        List.of("Budi", "Romi", "Nanda", "Budiono", "Balmont", "Alucard").stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);

//      Mencari bilangan genap
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {

        List.of("Budi", "Nanda", "Budi", "Romi", "Alfika", "Rexxy", "Bayu").stream()
                .distinct()
                .forEach(System.out::println);

    }

}
