package business;

import data.MedicalRecordRepository;
import domain.MedicalRecord;
import domain.Patient;

import java.util.List;

/** Business logic for "Doctor views medical records". */
public class MedicalRecordService {

    private final MedicalRecordRepository repo;

    // Constructor injection for better testability and flexibility
    public MedicalRecordService(MedicalRecordRepository repo) {
        if (repo == null) {
            throw new IllegalArgumentException("MedicalRecordRepository must not be null");
        }
        this.repo = repo;
    }

    public Patient requirePatient(int patientId) {
        Patient p = repo.findPatient(patientId);
        if (p == null) {
            throw new IllegalArgumentException("Patient ID not found: " + patientId);
        }
        return p;
    }

    public List<MedicalRecord> listRecords(int patientId) {
        requirePatient(patientId);
        return repo.findRecordsForPatient(patientId);
    }

    public MedicalRecord getRecord(int recordId) {
        MedicalRecord r = repo.findRecordById(recordId);
        if (r == null) {
            throw new IllegalArgumentException("Record not found: " + recordId);
        }
        return r;
    }

    public List<MedicalRecord> searchRecords(int patientId, String keyword) {
        requirePatient(patientId);
        if (keyword == null || keyword.isBlank()) {
            return listRecords(patientId);
        }
        return repo.searchInPatientRecords(patientId, keyword);
    }
}
