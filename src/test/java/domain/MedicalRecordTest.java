package domain;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class MedicalRecordTest {

    @Test
    void constructorAndGettersWork() {
        LocalDate date = LocalDate.of(2025, 1, 15);
        MedicalRecord r = new MedicalRecord(1, 1001, date, "Annual checkup", "All normal.");
        assertEquals(1, r.getRecordId());
        assertEquals(1001, r.getPatientId());
        assertEquals(date, r.getDate());
        assertEquals("Annual checkup", r.getSummary());
        assertEquals("All normal.", r.getNotes());
        assertTrue(r.toString().contains("Record #1"));
    }
}
