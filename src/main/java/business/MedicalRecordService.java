package business;

import domain.MedicalRecord;
import domain.Patient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/** Business logic for "Doctor views medical records". */
public class MedicalRecordService {

    private final List<Patient> patients = new ArrayList<>();
    private final List<MedicalRecord> records = new ArrayList<>();

    public MedicalRecordService() {
        // Sample data
        Patient p1 = new Patient(1, "Ahmed");
        Patient p2 = new Patient(2, "Sara");

        patients.add(p1);
        patients.add(p2);

        records.add(new MedicalRecord(
                1,
                1,
                LocalDate.now(),
                "Blood Test",
                "Blood test results are normal"
        ));

        records.add(new MedicalRecord(
                2,
                1,
                LocalDate.now(),
                "X-Ray",
                "Chest X-ray is clear"
        ));

        records.add(new MedicalRecord(
                3,
                2,
                LocalDate.now(),
                "Allergy",
                "Patient allergic to penicillin"
        ));
    }

    public Patient requirePatient(int patientId) {
        return patients.stream()
                .filter(p -> p.getId() == patientId)
                .findFirst()
                .orElseThrow(() ->
                        new IllegalArgumentException("Patient ID not found: " + patientId));
    }

    public List<MedicalRecord> listRecords(int patientId) {
        requirePatient(patientId);
        return records.stream()
                .filter(r -> r.getPatientId() == patientId)
                .collect(Collectors.toList());
    }

    public MedicalRecord getRecord(int recordId) {
        return records.stream()
                .filter(r -> r.getRecordId() == recordId)
                .findFirst()
                .orElseThrow(() ->
                        new IllegalArgumentException("Record not found: " + recordId));
    }

    public List<MedicalRecord> searchRecords(int patientId, String keyword) {
        requirePatient(patientId);

        if (keyword == null || keyword.isBlank()) {
            return listRecords(patientId);
        }

        String k = keyword.toLowerCase();

        return records.stream()
                .filter(r -> r.getPatientId() == patientId)
                .filter(r ->
                        r.getSummary().toLowerCase().contains(k) ||
                                (r.getNotes() != null && r.getNotes().toLowerCase().contains(k))
                )
                .collect(Collectors.toList());
    }
}
