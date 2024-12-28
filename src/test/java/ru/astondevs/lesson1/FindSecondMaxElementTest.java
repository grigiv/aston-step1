package ru.astondevs.lesson1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindSecondMaxElementTest {

    @Test
    public void find_second_max_element_simple() {
        int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        int secondMax = 44;
        assertEquals(secondMax, Lesson1.findSecondMaxElement(arr));
    }

    @Test
    public void find_second_max_element_one_element() {
        int[] arr = {10, 10};
        int secondMax = 10;
        assertEquals(secondMax, Lesson1.findSecondMaxElement(arr));
    }
}
