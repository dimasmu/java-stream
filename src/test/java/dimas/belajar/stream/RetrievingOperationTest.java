package dimas.belajar.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

    @Test
    void testLimit() {
        List.of("budiono", "siregar", "yanuar", "Joko", "Rudi", "Rexy").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("budiono", "siregar", "yanuar", "Joko", "Rudi", "Rexy").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
//      takewhile berbeda dengan filter contoh dibawah ketika kondisi name.length() nya false maka dia akan berhenti (filter semua di cek)
        List.of("Rexy", "sir", "yanuar", "Joko", "Rudi", "Budiono").stream()
                .takeWhile(name -> name.length() < 5)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
//      dropwhile kebalikan dari takewhile (Joko, Rudi) diambil karena kondisi false pertama kali ketika di yanuar sehingga yanuar sampai budiono diambil
        List.of("Rexy", "sir", "yanuar", "Joko", "Rudi", "Budiono").stream()
                .dropWhile(name -> name.length() < 5)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        List<String> nama = List.of("Rexy", "sir", "yanuar", "Joko", "Rudi", "Budiono");

        Optional<String> optName = nama.stream().findAny();

        optName.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testFindFirst() {
//      Mengambil data pertama
        List<String> nama = List.of("Rexy", "sir", "yanuar", "Joko", "Rudi", "Budiono");

        Optional<String> optName = nama.stream().findAny();

        optName.ifPresent(name -> {
            System.out.println(name);
        });
    }

}
