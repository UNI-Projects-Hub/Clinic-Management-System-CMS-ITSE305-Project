package com.clinic.provideMedicine;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PresentationTest {

    @Test
    void testStartProcessRunsWithoutErrors() {
        // we send a fake entry (Prescription ID)
        ByteArrayInputStream input = new ByteArrayInputStream("123\n".getBytes());
        System.setIn(input);

        // we pick up the output from System.out
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Presentation presentation = new Presentation();

        // we make sure that the program works without exceptions
        assertDoesNotThrow(presentation::startProcess);

        // we turn the output into text
        String printed = output.toString();

        // we verify that the important texts have appeared
        assertTrue(printed.contains("Provide Medicine System"));
        assertTrue(printed.contains("Checking prescription"));
        assertTrue(printed.contains("Prescription requires"));
        assertTrue(printed.contains("Checking medicine availability"));
        assertTrue(printed.contains("Dispensing"));
        assertTrue(printed.contains("Process Completed"));
    }
}

