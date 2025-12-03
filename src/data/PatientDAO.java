package data;

import java.util.HashMap;
import java.util.Map;

import models.Patient;

// DAO = Data Access Object layer
// Manages CRUD operations for Patient entities
public class PatientDAO {

    // Mock database (ID -> Patient)
    private final Map<Integer, Patient> patients = new HashMap<>();

    public PatientDAO() {
        // Sample data for testing
        patients.put(1, new Patient(1, "John Doe", "john@example.com", "1234567890", "123 Main St"));
    }

    // Retrieve a patient by ID
    public Patient getPatientById(int id) {
        return patients.get(id);
    }

    // Create a new patient (returns false if ID already exists)
    public boolean createPatient(Patient patient) {
        if (patient == null || patients.containsKey(patient.getId())) {
            return false;
        }
        patients.put(patient.getId(), patient);
        return true;
    }

    // Update an existing patient (returns false if patient does not exist)
    public boolean updatePatient(Patient patient) {
        if (patient == null || !patients.containsKey(patient.getId())) {
            return false;
        }
        patients.put(patient.getId(), patient);
        return true;
    }

    // Delete a patient (returns false if ID not found)
    public boolean deletePatient(int id) {
        if (!patients.containsKey(id)) {
            return false;
        }
        patients.remove(id);
        return true;
    }
}
