package ru.astondevs.lesson1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLastWordTest {

    @Test
    public void length_of_last_word_simple() {
        String string = "Hello world";
        int max = 5;
        assertEquals(max, Lesson1.lengthOfLastWord(string));
    }

    @Test
    public void length_of_last_word_spaces() {
        String string = "    fly me    to the moon    ";
        int max = 4;
        assertEquals(max, Lesson1.lengthOfLastWord(string));
    }

    @Test
    public void length_of_last_word_one_word() {
        String string = "a";
        int max = 1;
        assertEquals(max, Lesson1.lengthOfLastWord(string));
    }

    @Test
    public void length_of_last_word_no_words() {
        String string = "";
        int max = 0;
        assertEquals(max, Lesson1.lengthOfLastWord(string));
    }
}
