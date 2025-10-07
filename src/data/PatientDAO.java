package data;

import java.util.HashMap;
import java.util.Map;
import models.Patient;

// DAO = Data Access Object layer
// This class manages access to the patient data (CRUD operations)
public class PatientDAO {
    // A mock database using a HashMap (key = patient ID, value = Patient object)
    private Map<Integer, Patient> patients = new HashMap<>();

    // Constructor - adds a sample patient for testing
    public PatientDAO() {
        patients.put(1, new Patient(1, "John Doe", "john@example.com", "1234567890", "123 Main St"));
    }

    // Method to retrieve a patient using their ID
    public Patient getPatientById(int id) {
        return patients.get(id);
    }

    // Method to update an existing patient's record
    public void updatePatient(Patient patient) {
        patients.put(patient.getId(), patient);
    }
}
