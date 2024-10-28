package com.example.demo;


import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMainOutput() {
        // Redirecting System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        Main.main(new String[]{});

        // Restore original System.out
        System.setOut(originalOut);

        // Verify the output
        String expectedOutput = "Hello, world!\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}
