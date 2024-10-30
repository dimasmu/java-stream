package dimas.belajar.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregationOperationTest {

    @Test
    void testMax() {
//      Ambil data dengan huruf paling akhir
        List.of("Budi", "Yadi", "Adi", "Dodi").stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);

//      Ambil data dengan huruf paling awal
        List.of("Budi", "Yadi", "Adi", "Dodi").stream()
                .max(Comparator.reverseOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
//      Ambil data dengan huruf paling awal
        List.of("Budi", "Yadi", "Adi", "Dodi").stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
//      Ambil data dengan huruf paling awal
        Long count = List.of("Budi", "Yadi", "Adi", "Dodi").stream()
                .count();

        System.out.println(count);
    }

    @Test
    void testSum() {

        int hasil = List.of(1, 2, 3, 4, 5).stream()
                .reduce(0, (value, item) -> value + item);

        System.out.println(hasil);
//      0. initial=0
//      1. value=0 item=1 hasil=1
//      2. value=1 item=2 hasil=3
//      3. value=3 item=3 hasil=6
//      DST

    }

}
