package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

    @Test
    void constructorAndGettersWork() {
        Patient p = new Patient(1001, "Ali Hussain");
        assertEquals(1001, p.getId());
        assertEquals("Ali Hussain", p.getFullName());
        assertTrue(p.toString().contains("Ali Hussain"));
    }
}
