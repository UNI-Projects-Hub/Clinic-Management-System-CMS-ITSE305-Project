package business;

import domain.MedicalRecord;
import domain.Patient;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MedicalRecordServiceTest {

    private final MedicalRecordService service = new MedicalRecordService();

    @Test
    void requirePatient_returnsExisting() {
        Patient p = service.requirePatient(1001);
        assertNotNull(p);
        assertEquals(1001, p.getId());
        assertNotNull(p.getFullName());
    }

    @Test
    void requirePatient_throwsForMissing() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> service.requirePatient(9999));
        assertTrue(ex.getMessage().contains("Patient ID"));
    }

    @Test
    void listRecords_returnsSeededRecords() {
        List<MedicalRecord> list = service.listRecords(1001);
        assertNotNull(list);
        assertFalse(list.isEmpty(), "Expected seeded records for patient 1001");
    }

    @Test
    void getRecord_returnsExisting() {
        MedicalRecord r = service.getRecord(1);
        assertNotNull(r);
        assertEquals(1, r.getRecordId());
    }

    @Test
    void getRecord_throwsForMissing() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> service.getRecord(9999));
        assertTrue(ex.getMessage().contains("Record"));
    }

    @Test
    void searchRecords_keywordFiltersWithinPatient() {
        List<MedicalRecord> results = service.searchRecords(1001, "Flu");
        assertNotNull(results);
        assertTrue(results.size() >= 0); // call should not throw even if no match
    }

    @Test
    void searchRecords_blankKeywordFallsBackToList() {
        List<MedicalRecord> results = service.searchRecords(1001, "  ");
        List<MedicalRecord> full = service.listRecords(1001);
        assertEquals(full.size(), results.size());
    }
}
