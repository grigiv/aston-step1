package ru.astondevs.lesson1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeTest {

    @Test
    public void is_palindrome_simple() {
        String string = "abc";
        assertFalse(Lesson1.isPalindrome(string));
    }

    @Test
    public void is_palindrome_simple2() {
        String string = "112211";
        assertTrue(Lesson1.isPalindrome(string));
    }
}
