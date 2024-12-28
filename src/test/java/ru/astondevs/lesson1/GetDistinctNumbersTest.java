package ru.astondevs.lesson1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetDistinctNumbersTest {
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
    public void get_distinct_numbers_simple() {
        int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        Lesson1.getDistinctNumbers(ints);
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void get_distinct_numbers_one() {
        int[] ints = {1};
        Lesson1.getDistinctNumbers(ints);
        assertEquals("[1]", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void get_distinct_numbers_doubles() {
        int[] ints = {1, 1, 1};
        Lesson1.getDistinctNumbers(ints);
        assertEquals("[1]", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void get_distinct_numbers_empty() {
        int[] ints = {};
        Lesson1.getDistinctNumbers(ints);
        assertEquals("[]", outputStreamCaptor.toString()
                .trim());
    }
}
