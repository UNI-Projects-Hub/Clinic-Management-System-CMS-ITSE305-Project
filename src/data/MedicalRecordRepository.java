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

    private final Map<Integer, Patient> patients;
    private final Map<Integer, List<MedicalRecord>> recordsByPatient;

    /**
     * Default constructor using in-memory seed data.
     * This constructor delegates to the configurable one below.
     */
    public MedicalRecordRepository() {
        this(createSeedPatients(), createSeedRecords());
    }

    /**
     * Configurable constructor so the repository is not tied
     * to hardcoded seed data. Callers can pass their own data
     * source (e.g., loaded from a file or DB).
     */
    public MedicalRecordRepository(Map<Integer, Patient> patients,
            Map<Integer, List<MedicalRecord>> recordsByPatient) {
        if (patients == null || recordsByPatient == null) {
            throw new IllegalArgumentException("patients and recordsByPatient must not be null");
        }
        // Copy into mutable maps so the repository can evolve independently
        this.patients = new HashMap<>(patients);
        this.recordsByPatient = new HashMap<>(recordsByPatient);
    }

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
                .findFirst()
                .orElse(null);
    }

    public List<MedicalRecord> searchInPatientRecords(int patientId, String term) {
        String q = term.toLowerCase(Locale.ROOT);
        return findRecordsForPatient(patientId).stream()
                .filter(r -> r.getSummary().toLowerCase(Locale.ROOT).contains(q)
                        || r.getNotes().toLowerCase(Locale.ROOT).contains(q))
                .collect(Collectors.toList());
    }

    // --- Seed helpers (kept separate to make replacing them later easier) ---

    private static Map<Integer, Patient> createSeedPatients() {
        Map<Integer, Patient> patients = new HashMap<>();
        patients.put(1001, new Patient(1001, "Ali Hussain"));
        patients.put(1002, new Patient(1002, "Fatima Salman"));
        return patients;
    }

    private static Map<Integer, List<MedicalRecord>> createSeedRecords() {
        Map<Integer, List<MedicalRecord>> recordsByPatient = new HashMap<>();

        recordsByPatient.put(1001, new ArrayList<>(List.of(
                new MedicalRecord(1, 1001, LocalDate.now().minusDays(2), "Annual checkup", "All normal."),
                new MedicalRecord(2, 1001, LocalDate.now().minusMonths(6), "Flu symptoms", "Tamiflu, rest."))));

        recordsByPatient.put(1002, new ArrayList<>(List.of(
                new MedicalRecord(3, 1002, LocalDate.now().minusDays(10), "Sprained ankle", "Physio twice weekly."),
                new MedicalRecord(4, 1002, LocalDate.now().minusYears(1), "Blood test", "Slight anemia."))));

        return recordsByPatient;
    }
}
