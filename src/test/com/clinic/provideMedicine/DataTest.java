package com.clinic.provideMedicine;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    @Test
    void testGetPrescribedMedicine() {
        Data data = new Data();

        String result = data.getPrescribedMedicine();

        assertEquals("Panadol", result, "Should return the prescribed medicine Panadol");
    }

    @Test
    void testCheckAvailability() {
        Data data = new Data();

        // Panadol available
        boolean available = data.checkAvailability("Panadol");
        assertTrue(available, "Panadol must be available");

        // not available medicine
        boolean notAvailable = data.checkAvailability("Unknown Drug");
        assertFalse(notAvailable, "Unknown drug should NOT be available");
    }
}



