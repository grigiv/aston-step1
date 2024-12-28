package ru.astondevs.lesson1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurnStringTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void turn_string_simple() {
        Lesson1.turnString("abcd");
        assertEquals("dcba", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void turn_string_single() {
        Lesson1.turnString("a");
        assertEquals("a", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void turn_string_digits() {
        Lesson1.turnString("123456");
        assertEquals("654321", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void turn_string_palindrome() {
        Lesson1.turnString("Madam");
        assertEquals("madaM", outputStreamCaptor.toString()
                .trim());
    }

}
