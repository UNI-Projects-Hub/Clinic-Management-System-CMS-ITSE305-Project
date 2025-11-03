package data;

import domain.MedicalRecord;
import domain.Patient;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Data access for patients & medical records.
 * Phase II uses in-memory seed data. Later you can switch to file/DB.
 */
public class MedicalRecordRepository {

    private final Map<Integer, Patient> patients = new HashMap<>();
    private final Map<Integer, List<MedicalRecord>> recordsByPatient = new HashMap<>();

    public MedicalRecordRepository() { seed(); }

    public Patient findPatient(int patientId) {
        return patients.get(patientId);
    }

    /** All records for a patient, newest first. */
    public List<MedicalRecord> findRecordsForPatient(int patientId) {
        return recordsByPatient.getOrDefault(patientId, Collections.emptyList())
                .stream()
                .sorted(Comparator.comparing(MedicalRecord::getDate).reversed())
                .collect(Collectors.toList());
    }

    public MedicalRecord findRecordById(int recordId) {
        return recordsByPatient.values().stream()
                .flatMap(List::stream)
                .filter(r -> r.getRecordId() == recordId)
                .findFirst().orElse(null);
    }

    public List<MedicalRecord> searchInPatientRecords(int patientId, String term) {
        String q = term.toLowerCase(Locale.ROOT);
        return findRecordsForPatient(patientId).stream()
                .filter(r -> r.getSummary().toLowerCase(Locale.ROOT).contains(q) ||
                             r.getNotes().toLowerCase(Locale.ROOT).contains(q))
                .collect(Collectors.toList());
    }

    private void seed() {
        patients.put(1001, new Patient(1001, "Ali Hussain"));
        patients.put(1002, new Patient(1002, "Fatima Salman"));

        recordsByPatient.put(1001, new ArrayList<>(List.of(
            new MedicalRecord(1, 1001, LocalDate.now().minusDays(2), "Annual checkup", "All normal."),
            new MedicalRecord(2, 1001, LocalDate.now().minusMonths(6), "Flu symptoms", "Tamiflu, rest.")
        )));

        recordsByPatient.put(1002, new ArrayList<>(List.of(
            new MedicalRecord(3, 1002, LocalDate.now().minusDays(10), "Sprained ankle", "Physio twice weekly."),
            new MedicalRecord(4, 1002, LocalDate.now().minusYears(1), "Blood test", "Slight anemia.")
        )));
    }
}
