package dimas.belajar.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperationTest {

    @Test
    void testAnyMatch() {
        // satu data bernilai true maka boolean menjadi true
        Boolean checkNumber = List.of(1, 21, 32, 45, 5, 6, 7, 8, 9, 10).stream()
                .anyMatch(number -> number > 20);

        System.out.println(checkNumber);

    }

    @Test
    void testAllMatch() {
        // semua list harus bernilai true maka boolean menjadi true
        Boolean checkNumber = List.of(1, 21, 32, 45, 5, 6, 7, 8, 9, 10).stream()
                .allMatch(number -> number > 20);

        System.out.println(checkNumber);

    }

    @Test
    void testNotMatch() {
        // semua list harus false maka boolean menjadi true
        Boolean checkNumber = List.of(1, 21, 32, 45, 5, 6, 7, 8, 9, 10).stream()
                .allMatch(number -> number > 20);

        System.out.println(checkNumber);

    }

}
