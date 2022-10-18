package ex7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PalindromeTest {

    @Test
    void shouldReturnTrue1() {
        var actual = Palindrome.palindromeChecker("level");
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnTrue2() {
        var actual = Palindrome.palindromeChecker("nOon");
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnTrue3() {
        var actual = Palindrome.palindromeChecker("ikar lapal raki");
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnFalse() {
        var actual = Palindrome.palindromeChecker("Java");
        Assertions.assertThat(actual).isFalse();
    }

    @Test
    void shouldThrowException1() {
        assertThrows(IllegalArgumentException.class, () -> Palindrome.palindromeChecker(null));
    }

    @Test
    void shouldThrowException2() {
        assertThrows(IllegalArgumentException.class, () -> Palindrome.palindromeChecker(""));
    }

    @Test
    void shouldThrowException3() {
        assertThrows(IllegalArgumentException.class, () -> Palindrome.palindromeChecker("   "));
    }
}