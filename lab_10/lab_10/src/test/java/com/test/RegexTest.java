package com.test;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RegexTest {
    @Test
    public void testRegex() {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+(?!.*\\.{2})@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        assertTrue(pattern.matcher("test@example.com").matches());
        assertTrue(pattern.matcher("test@stu.vistula.edu.pl").matches());
        assertFalse(pattern.matcher("test@examplecom").matches());
        assertFalse(pattern.matcher("test@vistula..pl").matches());
    }
}
